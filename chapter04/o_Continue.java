package chapter04;

public class o_Continue {
	public static void main(String[] args) {
		//contine문
		//반복문에서만 사용 가능
		//c문이 실행되면 조건식으로 이동
		/*
		 * for(...) {
		 * 실행문1
		 * continue;
		 * 실행문2
		 * }
		 * */
		
		//1에서 10사이의 수 중에서 짝수만 출력하는 코드
		for(int i=1;i<10;i++) {
			System.out.println(i);
			if(i%2!=0) {
				System.out.println("홀수"+i);
				continue;
				
			}
		}
		
	}

}
