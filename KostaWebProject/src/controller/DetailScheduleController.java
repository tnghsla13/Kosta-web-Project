package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Schedule;
import service.facade.ScheduleService;
import service.logic.ScheduleServiceLogic;

@WebServlet("/DetailSchedule.do")
public class DetailScheduleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ScheduleService service = new ScheduleServiceLogic();
		int scheduleId =2; 
		Schedule schedule = service.searchByScheduleId(scheduleId); 
		
		request.setAttribute("schedule", schedule);
		request.getRequestDispatcher("shcheduleDetail.jsp").forward(request, response);
	}

}
