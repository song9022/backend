package chapter17.printable2;

public class PrintMain {

	public static void main(String[] args) {
		String myDoc="This is a report about...";
		
		//샘송 프린터로 출력
		Printable prn=new SPrinterDriver();
		prn.print(myDoc);
		
		//엘쥐 프린터 출력
		prn=new LPrinterDriver();
		prn.print(myDoc);
		
		//웹 백엔드 프레임워크인 스프링에서는
		//데이터베이스와 연결되는 부분에 인터페이스를 활용
		
		//상속
		//스프링에서 스프링시큐리티 사용하실 때
		//라이브러리를 활용할 때 내 코드를 커스텀마이징하게 연계해서 실행

	}

}










