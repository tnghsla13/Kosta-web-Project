package store.logic;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import domain.Member;
import store.facade.MemberStore;

public class MemberStoreLogic implements MemberStore {
	
	private static final String resource = "config.xml";
	
	private SqlSessionFactory getSessionFactory(){
		Reader reader = null;
		
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(reader);
	}

	@Override
	public boolean insertMember(Member member) {
		SqlSession session = getSessionFactory().openSession();
		try{
			int result = session.insert("insertMember", member);
			if(result>0){
				session.commit();
			}else{
				session.rollback();
			}
			return result>0;
		}finally{
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
		return null;
	}

}
