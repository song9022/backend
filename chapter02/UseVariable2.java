package chapter02;

public class UseVariable2 {
	public static void main(String[] args) {
		// 변수의 이름
		// 카멜 표기법(camel)
		// 변수 - 소문자로 시작, 다른 단어가 조합될 때 대문자 시작
		
		// ex. 정사각형의 넓이를 구하는 코드 작성
		// 공식 : 한 변의 길이 * 한 변의 길이
		// 정사각형의 한 변의 길이 = 7
		
		// 1. 리터럴 작성
		System.out.println(7*7);
		
		// 2. 변수 사용 작성
		// * 변수 지정시 그 변수의 용도를 표현하는 이름이 가장 좋은 이름
		int n; // 이것보다는
		int squre; // 이게 좋다
		int squreSide; // 좋은 예시2
		squreSide=7;
		System.out.println(squreSide*squreSide);
		squreSide=70;
		System.out.println(squreSide);
		
		int num1;
		// 값을 처음 대입(초기화) 해서 사용
		// System.out.println(num1);
		
		// 선언과 동시에 초기화
		int num2=42;
		
		// 여러 개를 동시에 선언 및 초기화
		int a,b,c;
		a=1;
		b=2;
		c=3;
		
		// 같은 공간에서는 이름이 같은 변수가 존재할 수 없다.
		// int a; (X)
		// int d=1, e=2; (O)
		
		// 정수 연산시 가장 많이 사용하는 자료형
		// = int
		// cpu개발시 int형 자료를 기본으로 연상한다고 생각하고 개발하기 때문에 int형 자료 계산이 가장 빠르다.

	}

}
