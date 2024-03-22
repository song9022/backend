package chapter19;

//Object클래스의 메서드 - toString()
//인스턴스에 대한 정보를 문자열로 제공할 목적으로 정의한 것이다
//인스턴스 변수에 저장된 값들을 문자열로 표현하는 뜻이다
//Object클래스에 정의된 toString()은
//호출하면 클래스이름과 16진수 해쉬코드로 된 인스턴스의 메모리 주소를 반환합니다
public class ObjectToString {
	
	public static void main(String[] args) {
		Card c1=new Card();
		System.out.println(c1);
		System.out.println(c1.toString());
		//참조변수 이름으로 콘솔에 출력하면 .toString() 생략된 것 처럼 호출 된다
		
		Card2 c2=new Card2();
		System.out.println(c2);
	}

}




















