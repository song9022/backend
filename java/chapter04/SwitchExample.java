package chapter04;

public class SwitchExample {

	public static void main(String[] args) {
		//switch문
		/*
		 * switch(변수){
		 * 	case 값1:
		 * 		실행문A
		 * 		break;
		 * 	case 값2:
		 * 		실행문B
		 * 		break;
		 * 	default:
		 * 		실행문C
		 * }
		 */
		//default 생략 가능 하다
		//변수==값2
		int num1=3;
		switch(num1) {
			case 1:
				System.out.println("num1:"+num1);
				break;
			case 2:
				System.out.println("num1:"+num1);
				break;
			default:
				System.out.println("무언가 잘못 되었습니다");
		}
		
		int time=8;
		System.out.println("[현재 시각: "+time+"시]");
		switch(time) {
			case 8:
				System.out.println("버스를 탑니다.");
				System.out.println("출근합니다.");
				break;
			case 9:
				System.out.println("회의를 합니다.");
				break;
			case 10:
				System.out.println("업무를 봅니다.");
				break;
			default:
				System.out.println("외근을 나갑니다.");
				break;
		}
		
		//break 키워드(keyword, 예약어)는 switch문과 반복문
		//실행을 완전히 끝낸다
		if(true) {
			System.out.println(1);
			System.out.println(2);
//			break;
		}
		//String 타입의 switch문
		String position="과장";
		
		switch(position) {
			case "부장":
				System.out.println("700만원");
				break;
			case "과장":
				System.out.println("500만원");
				break;
			default:
				System.out.println("300만원");
		}
	}

}










