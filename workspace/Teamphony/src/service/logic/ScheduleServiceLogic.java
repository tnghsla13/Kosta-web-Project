package service.logic;
import java.sql.Date;
import java.util.List;

import domain.Schedule;
import service.facade.ScheduleService;

public class ScheduleServiceLogic implements ScheduleService{

	@Override
	public boolean registerSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifySchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeSchedule(int scheduleId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Schedule> searchByCode(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schedule searchByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schedule searchByScheduleId(int scheduleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
