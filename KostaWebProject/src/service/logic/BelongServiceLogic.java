package service.logic;

import java.util.List;

import domain.Member;
import domain.Team;
import service.facade.BelongService;
import store.facade.BelongStore;
import store.logic.BelongStoreLogic;

public class BelongServiceLogic implements BelongService{
	BelongStore store;
	
	public BelongServiceLogic(){
		store = new BelongStoreLogic();
	}

	@Override
	public List<Member> searchMemberByCode(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> searchTeamByMemberId(String memberId) {
		return store.selectTeamByMemberId(memberId);
	}

	@Override
	public boolean belongToTeam(String memberId, int teamCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean withdrawTeam(String memberId, int teamCode) {
		// TODO Auto-generated method stub
		return false;
	}

}
