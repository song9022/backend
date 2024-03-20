package chapter07;

public class Phone {
	private String name;
	private String number;
	
	public void setPhone(String n, String nu) {
		name=n;
		number=nu;
	}
	
	public void getPhone() {
		System.out.println("이름: "+name);
		System.out.println("연락처: "+number);
	}
	
	public static void main(String[] args) {
		Phone phone1=new Phone();
		phone1.setPhone("이솨솨", "000-0000-0000");
		phone1.getPhone();
		Phone phone2=new Phone();
		phone2.setPhone("이랄라", "111-1111-1111");
		phone2.getPhone();
	}

}
