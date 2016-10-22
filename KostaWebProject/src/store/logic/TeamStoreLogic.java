package store.logic;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import domain.Team;
import store.facade.TeamStore;
import store.mapper.TeamMapper;

public class TeamStoreLogic implements TeamStore{
	
	private static final String resource = "resource/config.xml";
	
	private SqlSessionFactory getSessionFactory(){
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(reader);
	}

	@Override
	public boolean createTeam(Team team) {
		SqlSession session = getSessionFactory().openSession();
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
		SqlSession session = getSessionFactory().openSession();
		try{
			TeamMapper mapper = session.getMapper(TeamMapper.class);
			return mapper.selectTeamByCode(teamCode);
		}finally{
			session.close();
		}
	}

}
