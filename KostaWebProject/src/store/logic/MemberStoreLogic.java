package store.logic;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import domain.Member;
import store.facade.MemberStore;
import store.mapper.MemberMapper;
import store.mapper.TeamMapper;

public class MemberStoreLogic implements MemberStore {

	private SqlSessionFactory factory;

	public MemberStoreLogic() {

		factory = SqlSessionFactoryProvider.getSqlSessionFactory();

	}

	@Override
	public boolean insertMember(Member member) {

		SqlSession session = factory.openSession();
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			return mapper.insertMember(member);

		} finally {
			session.commit();
			session.close();
		}
	}

	@Override
	public boolean updateMember(Member member) {
		return false;
	}

	@Override
	public boolean deleteMember(String memberId) {
		return false;
	}

	@Override
	public Member selectByMemberId(String memberId) {

		SqlSession session = factory.openSession();
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			return mapper.selectByMemberId(memberId);

		} finally {
			
			session.close();
		}
	}
}
