
public class UseVariable {
	// 자동완성 ctrl+space
	// main을 적고 자동완성 단축키 
	// method(메소드,함수)
	public static void main(String[] args) {
		// 변수의 이해와 활용
		// - 변하는 수
		// - 메모리 공간의 활용을 위한 도구
		// - 메모리 공간의 할당과 접근을 위해 필요한 도구
//		System.out.println(num1);
//		System.out.println("num1");
		// 변수 num1의 선언 - 정수 데이터
		int num1;
		//변수에 값(data)를 할당(저장,대입)
		num1=10;
		//sysout - 자동완성 단축키
		System.out.println(num1);
		System.out.println(11);
		//변수를 선언 할때
		//(데이터 타입) (변수이름)
		//변수의 선언과 대입을 동시에 - 변수의 초기화
		int num2=20;
		//데이터가 그냥 표현된 것을 리터럴
		//리터럴로 코드 작성
		System.out.println("10+20="+(10+20));
		//4군데 수정
		System.out.println("30+40="+(30+40));
		//변수를 사용하여 코드 작성
		//2군데 수정
		int num3=30;
		int num4=40;
		System.out.println(num3+"+"+num4+"="+(num3+num4));
		//30+40으로 변경해야 하는 경우가 생겼다
		//유지보수를 하게 되었다
		//--변수를 많이 사용하자
		
		//변수의 선언
		//(자료형 data type) (변수의 이름)
		//자료형의 종류와 구분
		//자료형 / 데이터 / 크기
		//boolean / 참과 거짓 / 1바이트
		//char / 문자 / 2바이트
		//byte / 정수 / 1바이트
		//short / 정수 / 2바이트
		//int / 정수 / 4바이트
		//long / 정수 / 8바이트
		//float / 실수 / 4바이트
		//double / 실수 / 8바이트
		//자주쓰는 자료형 boolean, int, double
		//변수의 선언
		boolean b;
		int integer;
		double d;
		//변수의 이름
		//1. 자바는 대소문자를 구분한다
		int num5;
		int NUM5;
		//2. 변수의 이름은 숫자로 시작할 수 없다
		//int 1num;(X)
		//3. $과 _이외의 특수문자는 변수의 이름에
		//사용할 수 없다
		//일반적으로는 $과 _는 써서 변수이름을 정하지 않는다
		int n$;
		int n_;
		//4. 키워드는(자주색, 예약어) 변수의 이름으로 사용할 수 없다
		//int int; int boolean(X)
		//변수의 선언
		//자료형 변수이름;
		int number;
	}
}




