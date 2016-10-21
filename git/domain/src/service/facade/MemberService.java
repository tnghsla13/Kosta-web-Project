package service.facade;

import domain.Member;

public interface MemberService {
	
	public  boolean registerMember(Member member);
	public  boolean modifyMember(Member member);
	public  boolean removeMember(String memberId);
	public  boolean checkMember(Member member);
	public  Member searchByMemberId(String memberId);
	public  void saveStarPoint();

}
