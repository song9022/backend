package chapter04;

public class i_Example {
	public static void main(String[] args) {
		int prise=63000;
		
		if(prise>45000) {
			System.out.println("환급 대상입니다.");
			System.out.println("환급금은 총 "+(90000-prise)+"원 입니다.");
		}else if(prise<45000) {
			System.out.println("환급 대상이 아닙니다.");
		}else if(prise>90000) {
			System.out.println("환급 금액 : 45000");
		}
		
		
		
		//강사님 코드
		int pay=50000;
		if(pay<45000) {
			System.out.println("환급 금액이 없습니다.");
		}else if(pay<90000) {
//			System.out.println("환급 금액 : "+(90000-pay));
			int payBack=pay-45000;
			System.out.println("환급 금액 : "+payBack);
		}else {
			System.out.println("환급 금액 : 45000");
		}
		
	}

}
