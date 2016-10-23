package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Post;
import service.facade.PostService;
import service.logic.PostServiceLogic;
@WebServlet("/Team.do")
public class TeamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PostService service = new PostServiceLogic();
		List<Post> postList = new ArrayList<>();
		postList=service.searchAll();
		
		request.setAttribute("postList", postList);
		request.getRequestDispatcher("team.jsp").forward(request, response);
		
	}

}
