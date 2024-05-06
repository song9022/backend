package chapter25;

//열거형(enum, 이윰)
//여러 상수를 선언해야 할 때, 편리하게 선언할 수 있는 방법
//열거형의 정의
//enum 열거형이름{상수명1,상수명2,...}
//열거형에 정의된 상수를 사용하는 방법
//열거형이름.상수명 - 클래스의 static변수를 참조하는 것과 동일하다
public class AboutEnum {
	//열거형 kind를 정의
	enum Kind{
		CLOVER,HEART,DIAMOND,SPADE
	}
	//열거형 Value를 정의
	enum Value{
		TWO,THREE,FOUR
	}
	public static void main(String[] args) {
		//true지만 false이어야 의미상 맞음
		System.out.println(Card.CLOVER==Card.TWO);
		
		//열거형을 이용해서 상수를 정의한 경우는
		//값을 비교하기 전에 타입을 먼저 비교하므로
		//값이 같더라도 타입이 다르면 컴파일 에러가 발생한다
		
		//컴파일 에러, 타입이 달라서 비교 불가
//		System.out.println(AboutEnum.Kind.CLOVER==AboutEnum.Value.TWO);
	}

}














