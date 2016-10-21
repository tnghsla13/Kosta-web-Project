package service.logic;
import java.util.List;

import domain.Member;
import domain.Team;
import service.facade.BelongService;

public class BelongServiceLogic implements BelongService{

	@Override
	public List<Member> searchMemberByCode(int code) {
		return null;
	}

	@Override
	public List<Team> searchTeamByMemberId(String memberId) {
		return null;
	}

	@Override
	public boolean belongToTeam(String memberId, int teamCode) {
		return false;
	}

	@Override
	public boolean withdrawTeam(String memberId, int teamCode) {
		return false;
	}

}
