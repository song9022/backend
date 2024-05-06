package chapter11;

//메소드 오버로딩
//호출된 메소드를 찾을 때 참조하게 되는 두 가지 정보
// - 메소드의 이름
// - 메소드의 매개변수 정보

//메소드의 이름이 같을 때는 컴파일 에러 발생

//두 가지 경우에는 허용 한다
//1. 매개변수의 수가 다르다
//2. 매개변수의 타입이 다르다

//메소드 오버로딩(overloading)
//메소드 이름이 같지만 매개 변수의 수과 형을 다르게 하는 것

//변환형은 메소드 오버로딩의 조건 아님!

public class MyHome {
	
	public int simpleMethod() {
		return 0;
	}
	
//	public double simpleMethod() {
//		return 0.0;
//	}
	
	public void mySimpleRoom(int n) {
		System.out.println(n);
	}
	public void mySimpleRoom(double n) {
		System.out.println(n);
	}
	public void mySimpleRoom(int n1,int n2) {
		System.out.println(n1);
		System.out.println(n2);
	}

	public static void main(String[] args) {
		MyHome myHome=new MyHome();
		myHome.mySimpleRoom(0);
		myHome.mySimpleRoom(0,1);
		myHome.mySimpleRoom(1.2);
		
		System.out.println(0);
		System.out.println(0.0);
		System.out.println("string");
	}

}










