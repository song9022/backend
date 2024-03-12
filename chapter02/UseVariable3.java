package chapter02;

public class UseVariable3 {

	public static void main(String[] args) {
		// 정사각형의 둘레를 구하는 코드 작성
		// 한 변 * 4
		// 한 변의 길이 7
		int squreSide=7;
		System.out.println(squreSide*4);
		
		// 정사각형의 넓이를 구하는 코드 작성
		System.out.println(squreSide*squreSide);
		
		// 직사각형의 넓이를 구하는 코드 작성
		int squreSide2=5;
		System.out.println(squreSide*squreSide2);
		
		// 직사각형의 둘레를 구하는 코드 작성
		System.out.println(squreSide*2+squreSide2*2);
		
		// 반지름을 이용하여 원의 둘레는 구하는 코드 작성
		int radius=6;
		System.out.println(2*3.14*radius);
		
		// 삼각형의 넓이를 구하는 코드 작성
		int triSide=5;
		int triHight=7;
		System.out.println(triSide*triHight);
		
		// 삼각형의 둘레를 구하는 코드 작성
		System.out.println(triSide*3);
		
		// 정오각형의 둘레를 구하는 코드 작성
		int pentaSide=7;
		System.out.println(pentaSide*5);
		
		// 정칠각형의 둘레를 구하는 코드 작성
		int heptaSide=7;
		System.out.println(heptaSide*7);
		
		// 정팔각형의 둘레는 구하는 코드 작성
		int octaSide=7;
		System.out.println(octaSide*8);
		
		// 오늘 지급받은 3권의 교재의 총 페이지수를 구하는 코드 작성
		int bookpage1=70;
		int bookpage2=74;
		int bookpage3=81;
		System.out.println(bookpage1+bookpage2+bookpage3);

	}

}
