package chapter04;

public class g_IfElseExample {
	public static void main(String[] args) {
		//if-else문
		/*if(조건식) {
		     실행문A
	          }else{
	          실행문B
		      }
		 */
		
		//if문의 조건식이 true면 if블록이 실행
		//false면 else블록이 실행
		
		int score=85;
		
		if(score>=90) {
			System.out.println("점수 90점 이상");
			System.out.println("등급 A");
		}else {
			System.out.println("점수 90점 이하");
			System.out.println("등급 B");
		}
		
	}

}
