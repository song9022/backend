package chapter07;

public class Phone2 {
	private String name;
	private String number;
	

	
	public Phone2(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}


	

	@Override
	public String toString() {
		return "Phone2 [name=" + name + ", number=" + number + "]";
	}


	public static void main(String[] args) {
		Phone2 p2=new Phone2("김랄라", "010-2222-3333");
		System.out.println(p2.toString());

	}

}
