package chapter07;

public class EatingList2 {
	private String name;
	private double kal;
	private int price;
	

	
	public EatingList2(String name, double kal, int price) {
		super();
		this.name = name;
		this.kal = kal;
		this.price = price;
	}



	@Override
	public String toString() {
		return "EatingList2 [name=" + name + ", kal=" + kal + ", price=" + price + "]";
	}


	public static void main(String[] args) {
		EatingList2 e2=new EatingList2("햄버거", 350, 3200);
		System.out.println(e2.toString());
	}

}
