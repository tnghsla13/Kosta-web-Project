package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.facade.ScheduleService;
import service.logic.ScheduleServiceLogic;

@WebServlet("/deleteSchedule.do")
public class DeleteScheduleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int scheduleId = Integer.parseInt(request.getParameter("scheduleId"));
		ScheduleService service = new ScheduleServiceLogic();
		service.removeSchedule(scheduleId);
		
		response.sendRedirect("calender.do");
	}

}
