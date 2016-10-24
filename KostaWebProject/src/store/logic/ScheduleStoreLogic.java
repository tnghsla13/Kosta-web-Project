package store.logic;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import domain.Schedule;
import store.facade.ScheduleStore;
import store.mapper.ScheduleMapper;

public class ScheduleStoreLogic implements ScheduleStore {
	private SqlSessionFactory factory;

	public ScheduleStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public boolean insertSchedule(Schedule schedule) {
		SqlSession session = factory.openSession();

		try {
			ScheduleMapper mapper = session.getMapper(ScheduleMapper.class);
			if (mapper.insertSchedule(schedule)) {
				session.commit();
				return true;
			} else {
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

		try {
			ScheduleMapper mapper = session.getMapper(ScheduleMapper.class);
			if (mapper.updateSchedule(schedule)) {
				session.commit();
				return true;
			} else {
				session.rollback();
				return false;
			}
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteSchedule(int scheduleId) {
		SqlSession session = factory.openSession();

		try {
			ScheduleMapper mapper = session.getMapper(ScheduleMapper.class);
			if (mapper.deleteSchedule(scheduleId)) {
				session.commit();
				return true;
			} else {
				session.rollback();
				return false;
			}
		} finally {
			session.close();
		}
	}

	@Override
	public List<Schedule> selectByCode(int code) {
		SqlSession session = factory.openSession();

		try {
			ScheduleMapper mapper = session.getMapper(ScheduleMapper.class);
			return mapper.selectByCode(code);
		} finally {
			session.close();
		}
	}

	@Override
	public List<Schedule> selectByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schedule selectByScheduleId(int scheduleId) {
		Schedule sch = new Schedule();
		// TODO Auto-generated method stub
		SqlSession session = factory.openSession();
		try{
			ScheduleMapper mapper = session.getMapper(ScheduleMapper.class);
			sch=mapper.selectByScheduleId(scheduleId);
			System.out.println(sch.getStartDate().toString());
			return sch;
		}finally{
			session.close();
		}
	}

}


