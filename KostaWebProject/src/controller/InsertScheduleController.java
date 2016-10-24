package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.Schedule;
import service.facade.ScheduleService;
import service.logic.ScheduleServiceLogic;

@WebServlet("/insertSchedule.do")
public class InsertScheduleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String title = request.getParameter("scheduleTitle");
		String place = request.getParameter("schedulePlace");
		
		String startDate = request.getParameter("startDay") + " " + request.getParameter("startHour");
		SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd HH:MM");
		Date beginDate = null;
		try {
			beginDate = in.parse(startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String endDate = request.getParameter("endDay") + " " + request.getParameter("endHour");
		SimpleDateFormat inn = new SimpleDateFormat("yyyy-MM-dd HH:MM");
		Date finishDate = null;
		try {
			finishDate = inn.parse(endDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String contents = request.getParameter("scheduleContents");
		
		HttpSession session = request.getSession();
//		int teamCode = (int) session.getAttribute("code");
		
		Schedule schedule = new Schedule();
		schedule.setTitle(title);
		schedule.setPlace(place);
		schedule.setStartDate(beginDate);
		schedule.setEndDate(finishDate);
		schedule.setContents(contents);
		
		ScheduleService service = new ScheduleServiceLogic();
		service.registerSchedule(schedule);
		
		response.sendRedirect("calender.do");	
		}
}
