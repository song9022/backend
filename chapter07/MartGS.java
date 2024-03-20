package chapter07;

public class MartGS {
	private String name;
	private String enterTime;
	private int price;
	

	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEnterTime() {
		return enterTime;
	}



	public void setEnterTime(String enterTime) {
		this.enterTime = enterTime;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "MartGS [name=" + name + ", enterTime=" + enterTime + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		MartGS mgs=new MartGS();
		mgs.setName("당근");
		mgs.setEnterTime("06:00");
		mgs.setPrice(650);
		System.out.println(mgs.toString());

	}

}
