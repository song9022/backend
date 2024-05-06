package chapter18;

//예외 클래스
//예외(exception)란
//사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인해
//발생하는 프로그램 오류를 말합니다
//예외 발생되면 프로그램은 곧바로 종료 된다
//예외 처리를 통해 프로그램을 종료하지 않고 정상 실행 상태가
//유지되도록 할 수 있습니다

//예외의 두종류
//일반 예외 - 컴파일러 예외(에러, 오류), 자바 소스를 컴파일하는 과정에서
//문법적 오류를 말한다
//실행 예외 - 컴파일러 넌 체크 예외, 실행 시 예측할 수 없이 갑자기 발생하는 오류를 말한다

//프로그램을 실행하는 도중에 예외가 발생하면 해당 예외 클래스로 객체(인스턴스)를 생성합니다
//예외 처리 코드에서 예외 객체를 이용할 수 있도록 해줍니다

//실행 예외
//NullPointerException 예외
//객체 참조가 없는 상태, 즉 null값을 갖는 참조 변수로
//객체 접근 연산자인 도토(.)를 사용했을 때 발생
public class NullPointException {
	
	public static void main(String[] args) {
		String str="문자열";
		System.out.println(str.toString());
		String data=null;
		System.out.println(data.toString());
		//어떤 예외가 어떤 소스의 몇 번째 코드에서 발생했는지에 대한 정보가 들어 있습니다
		System.out.println("프로그램 종료");
	}

}













