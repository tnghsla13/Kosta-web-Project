package store.logic;

import java.io.Reader;

import domain.Team;
import store.facade.TeamStore;

public class TeamStoreLogic implements TeamStore {
	
	private static final String resource = "store/config.xml";
	
	private SqlSessionFactory getSessionFactory(){
		Reader reader = null;
		
	}
	
	@Override
	public boolean createTeam(Team team) {
		
		
		
		return false;
	}

	@Override
	public boolean updateTeam(Team team) {
		return false;
	}

	@Override
	public boolean deleteTeam(int teamCode) {
		return false;
	}

	@Override
	public Team selectTeamByCode(int teamCode) {
		return null;
	}

}
