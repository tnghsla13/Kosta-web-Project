package store.facade;

import java.sql.Date;
import java.util.List;

import domain.Schedule;

public interface ScheduleStore {
	
	public boolean insertSchedule(Schedule schedule);
	public boolean updateSchedule(Schedule schedule);
	public boolean deleteSchedule(int scheduleId);
	public List<Schedule> selectByCode(int code);
	public List<Schedule> selectByDate(Date date);
	public Schedule selectByScheduleId(int scheduleId);

}
