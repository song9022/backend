package chapter07;

public class PhoneGS {
	private String name;
	private String number;
	

	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	@Override
	public String toString() {
		return "PhoneGS [name=" + name + ", number=" + number + "]";
	}



	public static void main(String[] args) {
		PhoneGS pgs=new PhoneGS();
		pgs.setName("김자바");
		pgs.setNumber("010-3333-6666");
		System.out.println(pgs.toString());
	}

}
