package chapter06;

public class a_Method02 {
	public static void main(String[] args) {
		//매개변수가 두개인 함수 호출
		// 문자열 삽입하면 에러. 타입과 수를 맞춰서 호출.      
		hiEveryone(12, 12.5);
		//호출
		double myHight=13.5;
		hiEveryone(12, myHight);
		byEveryone();
		
	}
	
	//매개변수가 둘인 메소드 정의
	public static void hiEveryone(int age, double height) {
		//int age
		System.out.println("제 나이는 "+age+"세입니다.");
		System.out.println("제 키는 "+height+"cm 입니다");
		
	}
	
	//매개변수(입력)가 없는 메소드의 정의
	//voide : 반환(출력)이 없다.
	public static void byEveryone () {
		System.out.println("다음에 뵙겠습니다.");
	}

}

