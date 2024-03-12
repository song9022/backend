package chapter02;

public class UseVariable {
	// 자동완성 ctrl+space
	// main을 적고 자동완성 단축키 > 자동완성 메뉴창
	// method(메소드, 함수)
	public static void main(String[] args) {
		// 변수의 이해와 활용
		// - 변하는 수
		// - 메모리 공간의 활용을 위한 도구
		// - 메모리 공간의 할당과 접근을 위해 필요한 도구
		

		// System.out.println(num1);
		// System.out.println("num1");
		// 변수 num1의 선언 - 정수 데이터
		int num1;
		// 변수에 값(data)를 할당(저장, 대입)
		num1=10;
		
		// ▼ sysout - 자동완성 단축키
		System.out.println(num1);
		System.out.println(11);
		// 변수 선언할 때
		// (데이터 타입) (변변수이름)
		// 변수의 선언과 대입을 동시에 진행 - 변수의 초기화
		int num2=20;
		 
		// 리터럴 :
		// 변수를 사용하지 않고 그대로 표현
		// ▼리터럴로 코드 작성
		System.out.println("10+20="+(10+20));
		
		// ▼ 변수를 사용하여 코드 작성
		int num3=10;
		int num4=20;
		System.out.println(num3+"+"+num4+"="+(num3+num4));
		
		// ▼ 30+40으로 변경해야하는 경우 발생
		// = 유지보수가 필요해짐
		
		// 리터럴 = 4개 보수(모든 데이터를 수정)
		// 변수 사용 = 2개 보수(변수 수정)
		// 유지보수성이 좋은 코드가 더 좋은 코드
		// 즉, 변수 사용 코드가 더 좋은 코드
		// = 변수를 더 많이 사용하길 권장
		
		
		// 변수의 선언
		// (자료형 data type) (변수의 이름)
		
		// ? 자료형의 종류와 구분
		// 자료형 / 데이터 / 크기로 구분
		// 1. boolean / 참과 거짓 데이터 / 1바이트
		// 2. char / 문자 / 2바이트
		// 3. byte / 정수 / 1바이트
		// 4. short / 정수 / 2바이트
		// 5. long / 정수 / 8바이트
		// 6. float / 실수 / 4바이트
		// 7. double / 실수 / 8바이트
		
		// * 자주 쓰는 자료형 :
		// boolean, int, double
		
		// 변수의 선언 실습
		boolean b;
		int integer;
		double d;
		
		// 변수의 이름 :
		// 1. 자바는 대소문자를 구분하기 때문에 주의.
		int num5;
		int NYM5;
		// 둘은 다른 변수.
		
		// 2. 변수의 이름은 숫자로 시작할 수 없다.
		// int  1num; (X)
		
		// 3. $과 _이외의 특수문자는 사용 x 일반적으로 사용하지도 X
		int n$;
		int n_;
		// 사용가능하지만 보편적으로 사용 X
		
		// 4. 키워드는(자주색, 예약어) 변수의 이름으로 사용할 수 없다.
		// int int; (X), int boolean(X)
		
		//변수의 선언
		//자료형 변수이름;
		int number; 
	}

}
