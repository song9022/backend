package chapter04;

public class j_forPractice2 {
	public static void main(String[] args) {
		
		//1~100사이의 3배수를 구하여 모두 더하기
		int sum=0;
		for(int i=1;i<100;i++) {
			if(i%3==0) {
				sum=sum+i;
			}
		}
		
		System.out.println("1~100사이의 3배수를 구하여 모두 더한 값 = "+sum);
		
	}

}
