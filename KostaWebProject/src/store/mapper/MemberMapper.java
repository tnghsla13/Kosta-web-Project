package store.mapper;

import domain.Member;

public interface MemberMapper {
	
	public boolean insertMember(Member member);
	public boolean updateMember(Member member);
	public boolean deleteMember(String memberId);
	public Member selectByMemberId(String memberId);

}
