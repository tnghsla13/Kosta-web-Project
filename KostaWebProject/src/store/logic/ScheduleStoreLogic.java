package store.logic;

import java.sql.Date;
import java.util.List;

import domain.Schedule;
import store.facade.ScheduleStore;

public class ScheduleStoreLogic implements ScheduleStore{

	@Override
	public boolean insertSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSchedule(int scheduleId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Schedule> selectByCode(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Schedule> selectByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schedule selectByScheduleId(int scheduleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
