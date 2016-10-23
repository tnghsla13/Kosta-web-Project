package store.logic;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import domain.Team;
import store.facade.TeamStore;
import store.mapper.TeamMapper;

public class TeamStoreLogic implements TeamStore{
	
private SqlSessionFactory factory;
	
	public TeamStoreLogic(){
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public boolean createTeam(Team team) {
		SqlSession session = factory.openSession();
		try{
			TeamMapper mapper = session.getMapper(TeamMapper.class);
			return mapper.createTeam(team);
		}finally{
			session.commit();
			session.close();
		}
	}

	@Override
	public boolean updateTeam(Team team) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTeam(int teamCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Team selectTeamByCode(int teamCode) {
		SqlSession session = factory.openSession();
		try{
			TeamMapper mapper = session.getMapper(TeamMapper.class);
			return mapper.selectTeamByCode(teamCode);
		}finally{
			session.close();
		}
	}

}
