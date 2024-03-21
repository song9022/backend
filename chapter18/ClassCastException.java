package chapter18;

public class ClassCastException {
	
	public static void main(String[] args) {
		//타입 변환은 상위클래스와 하위클래스하고
		//구현 클래스와 인터페이스 간에도 발생합니다.
		Animal animal1=new Dog();
		Animal animal2=new Animal();
		Dog dog1=(Dog)animal1;
		Dog dog2=(Dog)animal2;
	}

}
