import java.util.ArrayList;

public class Member {
	private String id,name, phoneNum, major; //이름, 전화번호, 전공
	
	public Member(String name, String phoneNum, String id, String major) {
		this.id = id;
		this.name = name;
		this.phoneNum = phoneNum;
		this.major = major;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	@Override
	public String toString() {
		return "Member [name=" + name + ", phoneNum=" + phoneNum + ", major=" + major + "]";
	}
	
	
	
	

}
