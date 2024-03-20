package chapter10;

//? static
// 실사용은 거의 X
// enum 나열 값을 많이 사용.
public class InstCnt {
	private int instNum=1;
	static int instStaticNum=0;
	
	public InstCnt (int instNum) {
		this.instNum=instNum;
	}
	
	
	
	@Override
	public String toString() {
		return "InstCnt [instNum=" + instNum + "]";
	}
	
	public static void sayHello() {
		
		System.out.println("Hello World!");
	}


	public static void main(String[] args) {
		//인스턴스 변수 instNum을 사용하기 위해서
		//인스턴스 생성 -클래스 틀을 이요해 인스턴스를 만들어서 메모리에 올린다.
		InstCnt instCnt=new InstCnt(42);
		System.out.println(instCnt.toString());
		//static 선언을 붙이면 클래스 변수 된다
		//static의 의미는 바로 사용이 가능하게 메모리에 올린다.
		InstCnt.instStaticNum=42;
		System.out.println(instStaticNum);
		//메소드 내부의 변수
		//메소드에 static붙이면 클래스 메소드 메모리에 바로 적재되어서 사용이 가능
		int num1=0; 
		InstCnt.sayHello();
		//클래스 내부에서 static 변수나 메소드를 사용할 떄
		//클래스 이름 생략 가능
		sayHello();
		System.out.println(instStaticNum);
		
		//static을 붙인 클래스 변수나 메소드 사용은 하지 x
		//enum : 나열되는 데이터 값 < 주로 사용
		
		//main 메소드
		// : 인스턴스 생성과 관계없이 제일 먼저 호출되는 메소드
		// static을 붙여야한다.
		//main메소드의 호출 명령은 외부로부터 시작되는 명령어
		//public이 붙어있음
		
	}

}
