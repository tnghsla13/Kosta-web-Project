package store.logic;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import domain.Post;
import store.facade.PostStore;
import store.mapper.PostMapper;

public class PostStoreLogic implements PostStore{
	
	private SqlSessionFactory factory;
	
	public PostStoreLogic(){
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public boolean insertPost(Post post) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Post> selectAllPost() {
		SqlSession session = factory.openSession();
		
		try{
			PostMapper mapper = session.getMapper(PostMapper.class);
			return mapper.selectAllPost();
		}finally{
			session.commit();
			session.close();
		}
		
	}

	@Override
	public List<Post> selectByPostId(int postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> selectByMedia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> selectByFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> selectByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> selectByContents(String postContents) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePost(Post post) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePost(Post post) {
		// TODO Auto-generated method stub
		return false;
	}

}
