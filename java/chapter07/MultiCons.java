package chapter07;

public class MultiCons {
	//클래스의 인스턴스 변수 부 - 속성, field
	private String name;
	private String phoneNumber;
	
	//생성자는 1개 이상 여러개 존재 할 수 있다
	
	public MultiCons() {
	}
	public MultiCons(String name) {
		this.name=name;
	}	
	//생성자 자동 완성 source - generate constructor using fields
	public MultiCons(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "MultiCons [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

	public static void main(String[] args) {
		//기본 생성자 사용해서 인스턴스 생성
		MultiCons mc1=new MultiCons();
		//매개변수 1개인 생성자 호출
		MultiCons mc2=new MultiCons("김생성");
		//매개변수 2개인 생성자 호출
		MultiCons mc3=new MultiCons("김자바","전화번호");
		
		//초기화 메소드를 사용하는 방법(X)
		//DTO, VO 클래스를 작성할때는 두가지 방법
		//1. 생성자로 인스턴스 변수에 값을 대입하는 방법
		//2. getter setter 메소드로 값을 대입하는 방법
		
		//클래스의 이름 규칙
		//1. 클래스 이름의 첫 문잔느 대문자로 시작한다.
		//2. 둘 이상의 단어가 묶여서 하나의 이름을 이룰 때,
		//새로 시작하는 단어는 대문자로 한다.
		//Camel Case 모델
		//ex) Circle+Point=CriclePoint
	}


}








