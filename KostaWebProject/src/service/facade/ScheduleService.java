package service.facade;
import java.sql.Date;
import java.util.List;

import domain.Schedule;


public interface ScheduleService {
	
	public boolean registerSchedule(Schedule schedule);
	public boolean modifySchedule(Schedule schedule);
	public boolean removeSchedule(int scheduleId);
	public List<Schedule> searchByCode(int code);
	public Schedule searchByDate(Date date);
	public Schedule searchByScheduleId(int scheduleId);

}
