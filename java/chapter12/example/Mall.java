package chapter12.example;

public class Mall {

	public static void main(String[] args) {
		Buyer b=new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}

}
