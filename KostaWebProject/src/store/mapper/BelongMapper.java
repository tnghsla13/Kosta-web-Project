package store.mapper;

import java.util.List;

import domain.Member;
import domain.Team;

public interface BelongMapper {
	
	public List<Member> selectMemberByCode(int teamCode);
	public List<Integer> selectTeamByMemberId(String memberId);
	public boolean insertBelong(String memberId, String teamCode);
	public boolean deleteBelong(String memberId, String teamCode);

}
