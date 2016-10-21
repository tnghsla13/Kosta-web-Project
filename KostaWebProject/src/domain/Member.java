package domain;

public class Member {

	private String id;
	private String password;
	private String alias;
	private String imagePath;
	private String starPoint;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getStarPoint() {
		return starPoint;
	}
	public void setStarPoint(String starPoint) {
		this.starPoint = starPoint;
	}
	
}
