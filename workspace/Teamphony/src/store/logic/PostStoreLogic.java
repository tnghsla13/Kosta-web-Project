package store.logic;

import java.util.List;

import domain.Post;
import store.facade.PostStore;

public class PostStoreLogic implements PostStore {

	@Override
	public boolean insertPost(Post post) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Post> selectAllPost() {
		// TODO Auto-generated method stub
		return null;
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
