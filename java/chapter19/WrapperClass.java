package chapter19;

//래퍼(wrapper) 클래스
//기본형(primitive type)변수도 어떨 때는 객체로 다뤄야 하는 경우가 있다
//예)매개변수로 객체를 요구할 때
//기본형 값이 아닌 객체로 저장해야 할때
//객체간의 비교가 필요할 때 등등
//기본형 값들을 객체로 변환하여 작업을 수행해야 한다
public class WrapperClass {
	
	public static void main(String[] args) {
		//기본 데이터 타입
		int num1=42;
		//객체형 데이터 타입
		Integer num2=num1;
		Integer num3=new Integer(42);
		Integer num4=42;
		//기본데이터 타입 / 래퍼클래스
		//boolean / Boolean
		//char / Chatacter
		//byte / Byte
		//short / Short
		//int / Integer
		//long / Long
		//float / Float
		//double / Double
		
		//문자열을 숫자로 변환하기
		//3가지 방법
		//아래의 방법 중 하나를 선택해서 사용
		int i1=new Integer("100").intValue();
		int i2=Integer.parseInt("100");//주로 이 방법을 많이 사용
		Integer i3=Integer.valueOf("100");
		
		//오토박싱 & 언박싱
		//기본 데이터 타입과 래퍼 클래스간에 형변환을 명시적으로 하지 않아도
		//자동으로 형변환 되는 것을 가르켜 오토박싱 & 언박싱
		Integer i4=42;
//		int i5=(int)i4;
		int i5=i4;
		int i6=i4+i5;
	}

}












