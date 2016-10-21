package store.logic;

import java.util.List;

import domain.Member;
import domain.Team;
import store.facade.BelongStore;

public class BelongStoreLogic implements BelongStore{
	
	private static final String resoource = "resource.config.xml";
	
	

	@Override
	public List<Member> selectMemberByCode(int teamCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> selectTeamByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertBelong(String memberId, String teamCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBelong(String memberId, String teamCode) {
		// TODO Auto-generated method stub
		return false;
	}

}
