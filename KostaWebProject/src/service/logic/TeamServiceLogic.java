package service.logic;

import java.util.ArrayList;
import java.util.List;

import domain.Team;
import service.facade.TeamService;
import store.facade.TeamStore;
import store.logic.TeamStoreLogic;

public class TeamServiceLogic implements TeamService{
	
	TeamStore store = new TeamStoreLogic();

	@Override
	public boolean makeTeam(Team team) {
		return store.createTeam(team);
	}

	@Override
	public boolean modifyTeam(Team team) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeTeam(int teamCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Team> myTeamList(List<Integer> memberIdList) {
		List<Team> list = new ArrayList<>();
		for (Integer teamCode : memberIdList) {
			list.add(store.selectTeamByCode(teamCode));
		}
		return list;
	}

	@Override
	public Team checkTeam(int teamCode) {
		return store.selectTeamByCode(teamCode);
	}

}
