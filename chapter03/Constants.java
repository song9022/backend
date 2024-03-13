package chapter03;

public class Constants {
	public static void main(String[] args) {
		// 상수(Constanrt)
		// - 변수에 값을 딱 한 번만 할당할 수 있다.
		// - 한 번 할당된 값은 변경이 불가능하다.
		// - 키워드 final 선언이 붙어있는 변수
		// 상수의 이름
		// - 모두 대문자로 짓는 것이 관례
		// - 단어의 연결은 언더바(_)
		int number=100;
		number=10;
		// ^ 재할당 가능
		
		final int MAX_SIZE=100;
//		MAX_SIZE=10;
		// ^ 오류발생. 재할당 불가능.
		
		final String str="문자열";
		final int CONST_ASSIGNED;
//		System.out.println(CONST_ASSIGNED);
		CONST_ASSIGNED=12;
//		CONST_ASSIGNED=11;
		
		// 상수의 장점
		// 1. 애플리케이션을 작성 할 때 변하면 안 되는 데이터는 상수로 설정 > 실수를 줄일 수 있다.
		// 2. 변수보다 메모리 효율이 좋음
		
		// 원을 다루는 코드
		final double PI_ORIGIN=3.14;
		
		// 리터럴(Literals)에대한 이해
		// - 자료형을 기반으로 표현이 되는 상수를 의미
		int num1=5+7; // 리터럴 5, 7
		// - 정수는 무조건 int형으로 인식하기로 약속되어 있음
		double num2=3.3+4.5; //리터럴 3.3, 4.5
		
		String str2 = "I love JAVA";
		
//		System.out.println(2200000000); (X)
		// ^자바에서 리터럴 정수는 int형이기 때문에
		// int형이 표현할 수 있는 =21억~21억 범위를 벗어나면 컴파일 에러 발생
		
		// long형 상수(리터럴)의 표현방법
		System.out.println(2200000000L); // < 오류 없음. 대소문자 관여X L을 붙여 long형 리터럴로 표현
		
		// 정수형 상수의 언더바 삽입
//		int money=1,000,000; (X)
		int money=1_000_000;
		System.out.println(money);
		
		// 실수형 리터럴
		// double형임을 명시하기 위해 d또는 D삽입
		System.out.println(330004999D);
		
		// float형으로 표현하려면 f또는 F삽입
		System.out.println(2.0004999f);
		
		// 실수형 리터럴은 e표기법도 가능
		System.out.println(3.4e3);
		
		// 부울형 리터럴
		System.out.println(true);
		System.out.println(false);
		
		// 문자형 리터럴 char
		System.out.println('한'); // 한 글자씩만 가능
		
		// 문자열 리터럴 String
		System.out.println("한글");
		
		// 이스케이프 시퀀스(escape sequences)
		// 화면상의 어떠한 상황 또는 상태를 표현하기 위해 약속된 문자
		// \n - 개행 문자
		System.out.println("Hello World! I love JAVA.");
		System.out.println("Hello World!");
		System.out.println("I love JAVA.");
		System.out.println("Hello World!\nI love JAVA.");
		
		// 인용문을 쓸 때 \"
		// "f를 문자 그대로 쌍따옴표 문자로 인식 \"
		// 이스케이프 시퀀스 \" - 큰따옴표 문자
		// "" - 문자열의 리터럴 시작과 끝
		System.out.println("제임스 고슬링 왈 \"블라블라\"");
		System.out.println("제임스 고슬링 왈 \'블라블라\'");
		
		// \t - 탭문자
		System.out.println("1+1\t=2");
		System.out.println("11+11\t=22");
		
		// \(백슬러시)를 단순 문자로 사용하고 싶을 때
		System.out.println("백슬러시(\\)는 키보드 엔터 위에 있습니다."); // 두 개 쓰면 하나는 남음
	}

}
