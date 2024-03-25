package chapter04;

public class ContinueExample {

	public static void main(String[] args) {
		//continue문
		//반복문에서만 사용 가능
		//continue문이 실행되면 조건식으로 이동한다
		/*
		 * for(...){
		 * 	실행문1
		 * 	continue;
		 * 	실행문2
		 * }
		 */
		//1에서 10 사이의 수 중에서 짝수만 출력하는 코드
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
	}

}










