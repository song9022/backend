package chapter06;

public class Method {

	public static void main(String[] args) {
		//메소드(Method), 함수(function)
		//기능별로 코드를 객체로 모우고
		//객체 끼리는 메세지로써 상호작용을 해야 한다
		//매개변수는 생략이 가능하다
		/*
		 * 리턴타입 메소드이름(매개변수){
		 * 	실행문
		 * }
		 */
		//메소드 이름 규칙
		//1. 소문자 시작 단어가 조합될 때 대문자
		//변수의 경우에는 처음 단어가 명사
		//메소드의 경우에는 처음 단어가 동사
		//매개변수는 변수의 선언이 들어 간다
		System.out.println("프로그램의 시작");
		//메소드 호출(call)
		//메소드이름()
		//메소드이름(값)
		hiEveryone(12);
		hiEveryone(13);
		System.out.println("프로그램의 끝");
	}
	
	public static void hiEveryone(int age) {
		System.out.println("좋은 아침입니다");
		System.out.println("제 나이는 "+age+"세 입니다.");
	}

}









