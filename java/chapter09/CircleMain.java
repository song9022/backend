package chapter09;

public class CircleMain {

	public static void main(String[] args) {
		Circle c1=new Circle(42);
		//인스턴스 변수를 직접 접근
		//컴파일 오류는 없지만 객체지향 관점에서 나쁜 코드 - 결합도 높다
//		c1.rad=10;
		//직접 접근을 막기 위해 인스턴스 변수에 private
		Circle c2=new Circle(42);
		c1.getArea();
		c2.getArea();
		
		//다른 클래스의 인스턴스 변수의 값을 변경 하거나 가져 올 때
		//getter setter(게더 세더)를 사용
		c1.setRad(7);
		System.out.println(c1.getArea());
		System.out.println(c1.getRad());
		
		
		
		//프로그래머는 혼동하고 실수를 할 수 있기 때문에 컴파일 오류가
		//발생되면 더 좋겠다
		//접근 수준 지시자
		//public > protected > default > private
		
		//객체끼리는 메세지를 통해서만 소통한다
		//메세지를 교환하는 주체는 메서드
		//인스턴스 변수에는 private
		//인스턴스 메소드(메서드) public
		
		//public 다른 패키지 내에서도 접근 가능
		//protected 상속 받은 클래스에서 접근 가능
		//default (접근 수준 지시자가 생략) 동일패키지
		//private 클래스 내부
		
		//클래스는 public
		//인스턴스 변수는 private
		//인스턴스 메소드는 public
		//객체 지향 관점에서 좋은 코드다
	}

}











