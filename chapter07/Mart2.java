package chapter07;

public class Mart2 {
	private String name;
	private String enterTime;
	private int price;
	
	public Mart2(String name, String enterTime, int price) {
		this.name = name;
		this.enterTime = enterTime;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Mart2 [name=" + name + ", enterTime=" + enterTime + ", price=" + price + "]";
	}


	public static void main(String[] args) {
		Mart2 m2=new Mart2("당근", "06:00", 650);
		System.out.println(m2.toString());
	}

}
