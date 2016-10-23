package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import domain.Member;
import service.facade.MemberService;
import service.logic.MemberServiceLogic;

@WebServlet("/register.do")
public class InsertMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int MAX_SIZE = 1024 * 1024 * 20;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// member data
		MemberService service = new MemberServiceLogic();
		Member member = new Member();
		String id = null, alias = null, pw = null, imgPath = null;

		// file data
		String root, savePath;
		root = request.getSession().getServletContext().getRealPath("/");
		savePath = root + "MemberContainer/";
		File folder;

		// for read file
		int read = 0;
		byte[] buf = new byte[1024];
		FileInputStream fin = null;
		FileOutputStream fout = null;

		try {

			// multipart form request receive
			// file is generated in directory you mentioned
			MultipartRequest multipartRequest = new MultipartRequest(request, savePath, MAX_SIZE, "UTF-8",
					new DefaultFileRenamePolicy());

			// value setting
			id = multipartRequest.getParameter("id");
			alias = multipartRequest.getParameter("alias");
			pw = multipartRequest.getParameter("password");
			imgPath = multipartRequest.getFilesystemName("imagePath");

			// folder generate
			folder = new File(savePath + id);
			folder.mkdirs();

			// default image copy
			fin = new FileInputStream(new File(savePath + "/default.png"));
			fout = new FileOutputStream(new File(folder.getAbsolutePath() + "/default.jpg"));
			while ((read = fin.read(buf, 0, buf.length)) != -1) {
				fout.write(buf, 0, read);
			}
			fin.close();
			fout.close();

			// if imagePath null
			if (imgPath == null) {

				imgPath = folder.getAbsolutePath() + "/default.png";

				// else
			} else {

				String[] fullPathSplit = imgPath.split("/");
				String fileName = fullPathSplit[fullPathSplit.length - 1];

				imgPath = savePath + fileName;

				File oldFile = new File(imgPath);
				fin = new FileInputStream(oldFile);
				fout = new FileOutputStream(new File(folder.getAbsolutePath() + "/" + fileName));

				while ((read = fin.read(buf, 0, buf.length)) != -1) {
					fout.write(buf, 0, read);
				}

				fin.close();
				fout.close();
				oldFile.delete();

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		// member generate

		member.setId(id);
		member.setPassword(pw);
		member.setAlias(alias);
		member.setImagePath(imgPath);
		member.setStarPoint(0.0);

		if (service.registerMember(member)) {

			response.sendRedirect("login.jsp");

		} else {

			response.sendRedirect("register.jsp");
		}

	}

}
