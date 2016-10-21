package service.facade;
import java.util.List;

import domain.Team;

public interface TeamService {
	public boolean makeTeam(Team team);
	public boolean modifyTeam(Team team);
	public boolean removeTeam(int teamCode);
	public List<Team> myTeamList(List<String> memberIdList);
}
