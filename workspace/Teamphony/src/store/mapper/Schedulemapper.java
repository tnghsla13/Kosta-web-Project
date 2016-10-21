package store.mapper;

import java.sql.Date;
import java.util.List;

import domain.Schedule;

public interface Schedulemapper {
	
	 boolean insertSchedule(Schedule schedule);
	 boolean updateSchedule(Schedule schedule);
	 boolean deleteSchedule(int scheduleId);
	 List<Schedule> selectByCode(int code);
	 List<Schedule> selectByDate(Date date);
	 Schedule selectByScheduleId(int scheduleId);

}
