package chapter12;

public class Child2 extends Parent2{
	private int x=20;
	
	public void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
	
	public void printY() {
		System.out.println("y="+y);
		System.out.println("this.y="+this.y);
		System.out.println("super.y="+super.y);
	}
	
	public static void main(String[] args) {
		Child2 child2=new Child2();
		child2.method();
		child2.printY();
	}
}








