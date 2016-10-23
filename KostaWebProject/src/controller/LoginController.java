package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.Member;
import service.facade.MemberService;
import service.logic.MemberServiceLogic;

@WebServlet("/login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MemberService service = new MemberServiceLogic();
		Member member = new Member();
		String loginId, loginPw;

		loginId = request.getParameter("loginId");
		loginPw = request.getParameter("loginPw");

		member.setId(loginId);
		member.setPassword(loginPw);
		// member check
		if (service.checkMember(member)) {

			HttpSession session = request.getSession();
			session.setAttribute("loginId", loginId);
			response.sendRedirect("main.html");

		} else {

			response.sendRedirect("register.jsp");
		}

	}

}
