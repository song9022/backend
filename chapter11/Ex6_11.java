package chapter11;

public class Ex6_11 {

	public static void main(String[] args) {
		Data_1 data_1=new Data_1();
		//클래스에 생성자를 정의하지 않고도
		//인스턴스를 생성할 수 있었다
		//=>클래스에 생성자가 하나도 정의되지 않은 경우
		//컴파일러는 자동적으로 아래와 같은 내용의
		//기본 생성자를 추가하여 컴파일 한다
		//기본 생성자: 클래스이름(){}
		//Ex6_11(){}
		
		Data_2 data_2=new Data_2(2);
		//Data_2 data_2_1=new Data_2();
		//complile error발생
		//클래스에 생성자가 하나라도 정의되면
		//기본 생성자를 추가 해주지 않는다
		
		//게더 세더로 인스턴스 변수에 값 대입
		Data_2 data_2_getset=new Data_2();
		data_2_getset.setValue(21);
	}

}















