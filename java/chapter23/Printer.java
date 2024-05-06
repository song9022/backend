package chapter23;

//인터페이스는 구현해야 한다
public class Printer implements Printable{
	public void print(String s) {
		System.out.println(s);
	}
}
