package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import domain.Team;
import service.facade.BelongService;
import service.facade.TeamService;
import service.logic.BelongServiceLogic;
import service.logic.TeamServiceLogic;

@WebServlet("/TeamListController")
public class TeamListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TeamService teamService = new TeamServiceLogic();
		BelongService belongService = new BelongServiceLogic();
		HttpSession session = request.getSession();
		
		List<Integer>list = new ArrayList<>(); 
		list=belongService.searchTeamByMemberId(request.getParameter((String)session.getAttribute("memberId")));
		
		
		
		
	}

}
