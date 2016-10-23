package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Member;
import service.facade.MemberService;
import service.logic.MemberServiceLogic;

@WebServlet("/register.do")
public class InsertMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MemberService service = new MemberServiceLogic();
		Member member = new Member();
		
		String id, alias, pw, imgPath;
		
		id = request.getParameter("id");
		alias = request.getParameter("alias");
		pw = request.getParameter("password");
		
		imgPath = request.getParameter("imagePath");
		
		if(imgPath==null) imgPath="default.jpg";
		
		
		
		
		member.setId(id);
		member.setAlias(alias);
		member.setPassword(pw);
		member.setImagePath(imgPath);
		member.setStarPoint(0.0);
		
		if(service.registerMember(member)){
		
			response.sendRedirect("login.jsp");
		
		}else{
			
			response.sendRedirect("register.jsp");
		}
		
		
	}

}
