package store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import domain.Member;
import store.facade.BelongStore;
import store.mapper.BelongMapper;

public class BelongStoreLogic implements BelongStore{
	private SqlSessionFactory factory;
	
	public BelongStoreLogic(){
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	
	@Override
	public List<Member> selectMemberByCode(int teamCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> selectTeamByMemberId(String memberId) {
		SqlSession session = factory.openSession();
		
		try{
			BelongMapper mapper = session.getMapper(BelongMapper.class);
			return mapper.selectTeamByMemberId(memberId);
		}finally{
			session.close();
		}
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
