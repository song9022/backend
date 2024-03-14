package chapter04;

import java.text.BreakIterator;

public class j_Switch {
	public static void main(String[] args) {
		// switch문
		/*
		 * switch(변수) {
		 * 	case 값1:
		 * 		실행문A
		 * 		break;
		 * 	case 값2:
		 * 		실행문B
		 * 		break;
		 * 	defult:
		 * 		실행문C
		 * 	}
		 * */
		//default 생략 가능
		// 변수==값2
		int num1=1;
		switch(num1) {
		case 1:
			System.out.println("num1 : "+num1);
			break;
		case 2:
			System.out.println("num1 : "+num1);
			break;
		default:
			System.out.println("무언가 잘못 되었습니다.");
		}
		
		int time=8;
		System.out.println("[현재 시각 : "+time+"시]");
		
		switch(time) {
			case 8:
					System.out.println("출근");
					break;
			case 9:
				System.out.println("회의");
				break;
			case 10:
				System.out.println("업무");
				break;
			case 11:
				System.out.println("외근");
				break;
		}
		
		// break 키워드(예약어)는 switch문과 반복문의 실행을 완전히 끝낸다
		// = if문 X
		if(true) {
			System.out.println(1);
			System.out.println(2);
//			break; < 오류
		}
		
		//String타입의 switch문
		String position="과장";
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default :
			System.out.println("300만원");
		}
		
		
	}

}
