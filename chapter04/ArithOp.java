package chapter04;

public class ArithOp {
	public static void main(String[] args) {
		// 연산자
		// 대입 연산자와 산술 연산자
		
		// 1. 대입 연산자
		// = : 연산자 오른쪽에 있는 값을 연산자 왼쪽에 대입
		// + : 두 피연산자의 값을 더한다
		// - : 두 피연산자의 값을 뺀다
		// * : 두 피연산자의 값을 곱한다
		// / : 두 피연산자의 값을 나눈다
		// % : 나눈 후 나머지를 반환하는 연산자
		int n1=10;
		int n2=3;
		int result=n1/n2;
		System.out.println(result);
		int r1=n1%n2;
		System.out.println(r1);
		
		//연산자의 우선순위
		int r2=2-1-3*2;
		System.out.println(r2);
		// 사칙연산과 동일하게 곱하기(*) 나누기(/)가 우선 연산
		
		int r3=(3+3)*2;
		System.out.println(r3);
		// 우선순위를 위해 소괄호 사용 가능
		
		// 복합 대입 연산자
		int num=1;
		num=num+5;
		num+=5; //num=num+5
		
		int num1=0;
		num1+=1;
		System.out.println(num1); //1
		System.out.println(num1+=5); //6
		System.out.println(num1+=15); //21
		// a=a-b -> a-=b
		// a=a*b -> a*=b
		// a=a/b -> a/=b
		// a=a%b -> a%=b
		
		// 관계 연산자
		// 참(true)과 거짓(false)로 값이 나옴
		// < - n1<n2 - n1이 n2보다 작은가?
		int number1=0;
		int number2=1;
		System.out.println(number1<number2);
		// 0<1 -> 참(true)
		
		boolean b1=number1<number2;
		System.out.println(b1);
		
		// > - n1>n2 - n1이 n2보다 큰가?
		System.out.println(number1>number2);
		// <= - 같거나 작은가
		System.out.println(number1<=number2);
		// >= - 같거나 큰가
		System.out.println(number1>=number2);
		int number3=0;
		System.out.println(number1>=number3);
		// == : 같은가
		System.out.println(number1==number2);
		// 데이터 타입과 값이 모두 같아야 == 연산의 값이 true
		String stringTypeNumber="0";
//		System.out.println(number1==stringTypeNumber); > 데이터 타입이 달라 컴파일에러 발생
		// != : 다른가?
		System.out.println(number1!=number2);
		// 정수와 실수를 비교할 때는 값만 비교
		int num2=42;
		double d1=42.0;
		System.out.println(num2==d1);
		
		//논리 연산자
		// & : 엠퍼센트
		// && : 논리 and , A&&B - A와 B가 모두 true이면 연산 결과는 true
		// 논리 and(&&) - 그리고
		// 피연산자1 / 피연산자2 / 연산결과
		// true / true / true
		// false / true / false
		// false / false / false
		System.out.println(true&&true);
		System.out.println(false&&true);
		System.out.println(false&&false);
		System.out.println((0>1)&&(1>2));
		System.out.println((0>1)&&(1<2));
		System.out.println((0<1)&&(1<2));
		
		// 논리 OR : || - 또는
		// A||B -> A와 B 둘 중 하나라도 true면 연산 결과는 true
		// 피연산자1 / 피연산자2 / 연산결과
		// true / true / true
		// false / true / true
		// true / false / true
		// false / false / false
		
		// 논리 NOT : ! - 반전
		// !A - 연산 결과는 A가 true이면 false, false이면 true
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!(0<1));
		
		boolean b3=0<1;
		System.out.println(!b3);
		
		
	}

}
