package store.facade;

import domain.Team;

public interface TeamStore {
	
	public boolean createTeam(Team team);
	public boolean updateTeam(Team team);
	public boolean deleteTeam(int teamCode);
	public Team selectTeamByCode(int teamCode);

}
