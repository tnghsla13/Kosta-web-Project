package store.facade;

import domain.Member;

public interface MemberStore {

	public boolean insertMember(Member member);
	public boolean updateMember(Member member);
	public boolean deleteMember(String memberId);
	public Member selectByMemberId(String memberId);
	
}
