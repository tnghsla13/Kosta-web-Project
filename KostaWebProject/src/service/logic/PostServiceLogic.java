package service.logic;

import java.util.List;

import domain.Post;
import service.facade.PostService;

public class PostServiceLogic implements PostService{

	@Override
	public Boolean registerPost(Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> searchAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post searchByPostId(int postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> searchByMedia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> searchByFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> searchByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> searchByContents(String postContents) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifyPost(Post post) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removePost(int postId) {
		// TODO Auto-generated method stub
		return false;
	}

}
