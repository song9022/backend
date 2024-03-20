package chapter07;

public class EatingListGS {
	private String name;
	private double kal;
	private int price;
	

	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getKal() {
		return kal;
	}



	public void setKal(double kal) {
		this.kal = kal;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "EatingListGS [name=" + name + ", kal=" + kal + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		EatingListGS egs=new EatingListGS();
		egs.setName("햄버거");
		egs.setKal(350);
		egs.setPrice(3200);
		System.out.println(egs.toString());
	}

}
