
public class UserInfo {
	String name;
	int intName;
	String location;
	UserInfo(String name){
		this.name = name;
	}
	UserInfo(int name){
		this.name = Integer.toString(name);
	}


	public void setLocation(String location) {
	this.location = location;
}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	
	
}
