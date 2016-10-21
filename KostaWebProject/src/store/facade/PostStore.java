package store.facade;

import java.util.List;

import domain.Post;

public interface PostStore {

	public boolean insertPost(Post post);
	public List<Post> selectAllPost();
	public List<Post> selectByPostId(int postId);
	public List<Post> selectByMedia();
	public List<Post> selectByFile();
	public List<Post> selectByMemberId(String memberId);
	public List<Post> selectByContents(String postContents);
	public boolean updatePost(Post post);
	public boolean deletePost(Post post);
	
}
