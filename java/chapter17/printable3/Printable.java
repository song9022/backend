package chapter17.printable3;

//문제 상황의 제시
//컬러 프린트 메소드가 추가 상황
//인터페이스가 많이 존재하는 상황에서 인터페이스간 상속은 인터페이스가
//존재하는 수많큼 상속을 늘려하는 문제가 발생

//인터페이스의 디폴트 메소드
public interface Printable {
	public void print(String doc);
	//디폴트 메소드
	default void printCMYK(String doc) {}
	//디폴트 메소드란
	//구현(완전한 메소드로 만든다)해도 되고 되고
	//안해도는 되는 메소드입니다
}













