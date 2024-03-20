package chapter07;

public class GetterSetter {
	private String name;
	private String phoneNumber;
	
	//게더세더 함수
	//게더 - 값을 가져올때
	//세더 - 값을 대입할때
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setPhoneNumber(String phonenumber) {
		this.phoneNumber=phonenumber;
		
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public static void main(String[] args) {
		GetterSetter gs=new GetterSetter();
		System.out.println(gs.getName());
		gs.setName=("김자바");
		System.out.println(gs.getName());
		gs.setName("전화번호");
		System.out.println(gs.getPhoneNumber());
		//DTO(data tranceger object), VO(value object)
		//클래스들은 두가지 방법으로 값을 초기화
		//1. 생성자 사용
		//2.게더세더(getter setter)사용
	}

}
