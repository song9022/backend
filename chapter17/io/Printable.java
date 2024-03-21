package chapter17.io;

//인터페이스 대상의 instanceof 연산자
//if(ca instanceof Cake)...
//Cake는 클래스의 이름도, 인터페이스의 이름도 될 수 있다
//ca 참조하는 인스턴스를 Cake형 참조변수로 참조할 수 있으면 true반환!
public interface Printable {
	public void printLine(String str);
}
