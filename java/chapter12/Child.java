package chapter12;

public class Child extends Parent{
	//자동적으로 age라는 멤버변수가 추가된 것과 같은 효과가 있다
	public void play() {
		System.out.println("놀자~");
	}
	//하위클래스에 새로운 코드가 추가 되어도 상위 클래스는
	//아무런 영향도 받지 않는다
	
	//상속
	// - 하위 클래스는 상위 클래스의 모든 멤버(변수와 메서드)를
	//상속 받는다
	// - 하위 클래스는 멤버 개수는 조상 클래스보다 항상 같거나 많다

}















