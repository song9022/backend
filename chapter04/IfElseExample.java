package chapter04;

public class IfElseExample {

	public static void main(String[] args) {
		//if-else문
		/* if(조건식){
		 * 	실행문A
		 * }else{
		 * 	실행문B
		 * }
		 */
		//if문의 조건식이 true이면 if문의 블록이 실행
		//조건식이 false이면 else블록이 실행
		
		int score=85;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
	}
}
