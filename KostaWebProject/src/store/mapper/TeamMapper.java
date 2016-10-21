package store.mapper;

import domain.Team;

public interface TeamMapper {
	
	public boolean createTeam(Team team);
	public boolean updateTeam(Team team);
	public boolean deleteTeam(int teamCode);
	public Team selectTeamByCode(int teamCode);

}
