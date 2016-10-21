package service.facade;
import java.util.List;

import domain.Member;
import domain.Team;

public interface BelongService {
	
	public List<Member> searchMemberByCode(int code);
	public List<Integer> searchTeamByMemberId(String memberId);
	public boolean belongToTeam(String memberId, int teamCode); 
	public boolean withdrawTeam(String memberId, int teamCode);

}
