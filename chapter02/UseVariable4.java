package chapter02;

public class UseVariable4 {
	public static void main(String[] args) {
		// 변수 선언
		int number=1;
		System.out.println(number);
		number=2;
		System.out.println(number);
		int num;
//		int number; (X)
		// ▲ 같은 이름으로 선언할 수 없다.
		
		// ;(세미콜론)은 문장의 끝을 의미. 세미 콜론 이전의 문장은 모두 오류없이 처리된다.
		int a=1,b=2;
		System.
		out.
		println(a); // < 처리는 되지만 권장되지 않음.
		
		int c=1;int d=2; // > 처리는 되지만 권장되지 않음.
		
		int num1;
		num1=10;
		// 이 내용을
		int num2=20;
		// 이렇게 한 줄로 표현 가능
		int num3=num1+num2;
		System.out.println(num3);
		// ▲ 변수 연산 가능
		
		// 다양한 자료형 활용의 예
		// 자바 기본 실수(소수점) 자료형은 double
		double pi=3.14;
		System.out.println();
		
		double d3;
		double d4;
		double d1, d2;
		double result;
		d1=1.0000001;
		d2=2.0000001;
		result=d1+d2;
		System.out.println(result);//3.0000002
		// 실수의 연산은 오차가 발생.
		// 한정된 공간에 실수를 저장하기 위해
		// 공식을 사용해서 소수점 자리를 제한하여 저장하기 때문.(소수점 자리를 제한하기 위해)
		// boolean, int, double을 활용
		
		// boolean : 불린, 불
		// 공간 1byte, 두가지 상황을 다를 수 있다.
		// 값으로 참과 거짓밖에 들어가지 않는다.
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		
		// 문자열 자료형
		String str1="문자열 자료형의 표현은 쌍따옴표";
		
		String lectureName="정보처리기능사 취득 과정";
		System.out.println(lectureName);
		
		// 변수 과제
		// 자기 소개 및 좋아하는 것 5개를 다양한 변수 선언을 통해 콘솔에 출력
		// 목적 : 변수를 선언하고 사용

	}

}
