package store.logic;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import domain.Schedule;
import store.facade.ScheduleStore;
import store.mapper.Schedulemapper;

public class ScheduleStoreLogic implements ScheduleStore{
	private SqlSessionFactory factory;
	
	public ScheduleStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	
	@Override
	public boolean insertSchedule(Schedule schedule) {
		SqlSession session = factory.openSession();
		
		try{
			Schedulemapper mapper = session.getMapper(Schedulemapper.class);
			if(mapper.insertSchedule(schedule)){
				session.commit();
				return true;
			}else{
				session.rollback();
				return false;
			}
		} finally {
			session.close();
		}
	}

	@Override
	public boolean updateSchedule(Schedule schedule) {
		SqlSession session = factory.openSession();

		try{
			Schedulemapper mapper = session.getMapper(Schedulemapper.class);
			if(mapper.updateSchedule(schedule)){
				session.commit();
				return true;
			}else{
				session.rollback();
				return false;
			}
		}finally{
			session.close();
		}
	}

	@Override
	public boolean deleteSchedule(int scheduleId) {
		SqlSession session = factory.openSession();
		
		try{
			Schedulemapper mapper = session.getMapper(Schedulemapper.class);
			if(mapper.deleteSchedule(scheduleId)){
				session.commit();
				return true;
			}else{
				session.rollback();
				return false;
			}
		}finally{
			session.close();
		}
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
