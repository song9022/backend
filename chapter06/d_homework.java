package chapter06;

public class d_homework {
	public static void main(String[] args) {
		
		//add 메서드 호출
		add(10, 2);
		subtract(10, 2);
		multiply(10, 2);
		divide(10, 2);
		rectangleRound(3, 5);
		rectangleArea(3, 5);
		triArea(6, 2);
		circleArea(4);
		squareArea(5);

	}
	
	//	두 수를 입력 받아 더한 값을 리턴 해주는 함수 만들기
	public static void add(int n1, int n2){ 
		System.out.println(n1+n2);
	}
	
	// 두 수를 입력 받아 뺀 값을 리턴 해주는 함수 만들기
	public static void subtract(int n1, int n2){ 
		System.out.println(n1-n2);
	}
	
	// 두 수를 입력 받아 곱한 값을 리턴 해주는 함수 만들기
	public static void multiply(int n1, int n2){ 
		System.out.println(n1*n2);
	}
	
	// 두 수를 입력 받아 나눈 값을 리턴 해주는 함수 만들기
	public static void divide(int n1, int n2){ 
		System.out.println(n1/n2);
	}
	
//	직사각형의 두변을 입력 받아 둘레는 리턴 해주는 함수
	public static void rectangleRound(int n1, int n2){ 
		System.out.println(n1*2+n2*2);
	}
	
//	직사각형의 두변을 입력 받아 넓이를 리턴 해주는 함수
	public static void rectangleArea(int n1, int n2){ 
		System.out.println(n1*n2);
	}
	
//	삼각형의 밑변과 높이를 입력 받아 넓이를 리턴 해주는 함수
	public static void triArea(int n1, int n2){ 
		System.out.println(n1*n2);
	}
	
//	원의 반지름을 입력 받아 넓이는 리턴 해주는 함수
	public static void  circleArea(int n1){ 
		System.out.println(n1*n1*3.14);
	}
	
//	정사각형의 한변을 입력 받아 넓이는 리턴 해주는 함수
	public static void squareArea(int n1){ 
		System.out.println(n1*n1);
	}

}









