package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
@WebServlet("/makeTeam.do")
public class MakeTeamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		TeamService service = new TeamServiceLogic();
//		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		Team team = new Team();
		
		Random random = new Random();
		
		team.setCycle(Integer.parseInt(request.getParameter("cycle")));

//		try {
//			team.setEndDate(transFormat.parse(request.getParameter("endDate")));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}


		team.setName(request.getParameter("name"));
		while(true){
			int teamCode=random.nextInt(9999);
			if(teamCode>999){
				if(service.checkTeam(teamCode)==null){
					team.setCode(teamCode);
					break;
				}
			}
		}
		
		team.setLeaderId((String)session.getAttribute("loginId"));
		service.makeTeam(team);
		response.sendRedirect("main.jsp");
	}

}
