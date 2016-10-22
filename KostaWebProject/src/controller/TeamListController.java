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

import domain.Team;
import service.facade.BelongService;
import service.facade.TeamService;
import service.logic.BelongServiceLogic;
import service.logic.TeamServiceLogic;

@WebServlet("/TeamList.do")
public class TeamListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TeamService teamService = new TeamServiceLogic();
		BelongService belongService = new BelongServiceLogic();
		HttpSession session = request.getSession();
		List<Team> teamList = new ArrayList<>();
		List<Integer>list = new ArrayList<>(); 
		
		list=belongService.searchTeamByMemberId(request.getParameter((String)session.getAttribute("memberId")));
		
		teamList=teamService.myTeamList(list);
		
		request.setAttribute("teamList", teamList);
		
		request.getRequestDispatcher("teamList.jsp").forward(request, response);
		
	}

}
