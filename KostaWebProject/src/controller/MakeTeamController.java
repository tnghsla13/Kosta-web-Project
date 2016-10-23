package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.Team;
import service.facade.TeamService;
import service.logic.TeamServiceLogic;
@WebServlet("/MakeTeamController")
public class MakeTeamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		TeamService service = new TeamServiceLogic();
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Team team = new Team();
		
		Random random = new Random();
		
//		team.setCycle(request.getParameter("cycle"));
//		try {
//			team.setEndDate((Date)request.getParameter("endDate"));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		team.setName(request.getParameter("name"));
		team.setLeaderId((String)session.getAttribute("id"));
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
