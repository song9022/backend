package chapter07;

//책 정보를 가지고 있는 클래스
public class Book {
	private String name;
	private int price;
	private String publisher;
	
	public void setBook(String n, int p, String pu) {
		name=n;
		price=p;
		publisher=pu;
	}
	
	public void getBook() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(publisher);
	}
	
	public static void main(String[] args) {
		Book book1=new Book();
		book1.setBook();
		book1.getBook();
	}

}
