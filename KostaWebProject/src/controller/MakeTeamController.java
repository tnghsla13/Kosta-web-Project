package controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Team;
import service.facade.TeamService;
import service.logic.TeamServiceLogic;
@WebServlet("/MakeTeamController")
public class MakeTeamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TeamService service = new TeamServiceLogic();
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Team team = new Team();
		
		Random random = new Random();
		
		team.setCycle(request.getParameter("cycle"));
		team.setEndDate(transFormat.parse(request.getParameter("endDate")));
		team.setName(request.getParameter("name"));
		while(true){
			int teamCode=random.nextInt(9999);
			if(teamCode>999){
				if(service.checkTeam(teamCode).equals(null)){
					team.setCode(teamCode);
					break;
				}
			}
		}
		service.makeTeam(team);
		response.sendRedirect("main.jsp");
	}

}
