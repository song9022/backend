package chapter07;

public class Mart {
	private String name;
	private String enterTime;
	private int price;
	
	public void setMart(String n, String et, int p) {
		name=n;
		enterTime=et;
		price=p;
	}
	
	public void getMart() {
		System.out.println("품목: "+name);
		System.out.println("입고시간: "+enterTime);
		System.out.println("가격: "+price);
	}
	
	public static void main(String[] args) {
		Mart mart1=new Mart();
		mart1.setMart("당근", "08:00", 990);
		mart1.getMart();
		Mart mart2=new Mart();
		mart2.setMart("가지", "08:00", 680);
		mart2.getMart();
	}

}
