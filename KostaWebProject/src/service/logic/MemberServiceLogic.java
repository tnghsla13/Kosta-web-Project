package service.logic;

import domain.Member;
import service.facade.MemberService;
import store.facade.MemberStore;
import store.logic.MemberStoreLogic;

public class MemberServiceLogic implements MemberService {

	MemberStore store;

	public MemberServiceLogic() {

		store = new MemberStoreLogic();

	}

	@Override
	public boolean registerMember(Member member) {
		return store.insertMember(member);
	}

	@Override
	public boolean modifyMember(Member member) {
		return store.updateMember(member);
	}

	@Override
	public boolean removeMember(String memberId) {
		return store.deleteMember(memberId);
	}

	@Override
	public boolean checkMember(Member member) {

		boolean returnVal = false;
		Member checkMember = searchByMemberId(member.getId());

		if (checkMember != null) {

			if (checkMember.getPassword().equals(member.getPassword())) {

				returnVal = true;
			}

		}

		return returnVal;
	}

	@Override
	public Member searchByMemberId(String memberId) {
		return store.selectByMemberId(memberId);
	}

	@Override
	public void saveStarPoint() {

		// not implement
	}

}
