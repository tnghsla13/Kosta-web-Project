package store.facade;

import java.util.List;

import domain.Member;
import domain.Team;

public interface BelongStore {
	
	public List<Member> selectMemberByCode(int teamCode);
	public List<Team> selectTeamByMemberId(String memberId);
	public boolean insertBelong(String memberId, String teamCode);
	public boolean deleteBelong(String memberId, String teamCode);

}
