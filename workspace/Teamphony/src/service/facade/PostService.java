package service.facade;
import java.util.List;

import domain.Post;

public interface PostService {
	public Boolean registerPost(Post post);
	public List<Post> searchAll();
	public Post searchByPostId(int postId);
	public List<Post> searchByMedia();
	public List<Post> searchByFile();
	public List<Post>  searchByMemberId(String memberId);
	public List<Post>searchByContents(String postContents);
	public boolean modifyPost(Post post);
	public boolean removePost(int postId);

}
