package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Schedule;
import service.facade.ScheduleService;
import service.logic.ScheduleServiceLogic;
@WebServlet("/ScheduleListController")
public class ScheduleListController extends HttpServlet {	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ScheduleService service = new ScheduleServiceLogic();
		List<Schedule> list = service.searchByCode(2); 
		request.setAttribute("list", list);
		request.getRequestDispatcher("calendar.jsp").forward(request, response);

	
	}

}


