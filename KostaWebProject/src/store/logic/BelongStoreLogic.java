package store.logic;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import domain.Member;
import domain.Team;
import store.facade.BelongStore;
import store.mapper.BelongMapper;

public class BelongStoreLogic implements BelongStore{
	
	private static final String resource = "resource.config.xml";
	
	private SqlSessionFactory getSessionFactory(){
		Reader reader = null;
		
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(reader);
	}
	
	@Override
	public List<Member> selectMemberByCode(int teamCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> selectTeamByMemberId(String memberId) {
		SqlSession session = getSessionFactory().openSession();
		
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
