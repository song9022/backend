package chapter04;

public class k_Forexample {
	public static void main(String[] args) {
		
		//for문 구구단
		for(int i=2; i<10; i++) {
			System.out.println(i+"단 공식");
			
			for(int j=1;j<10;j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}
		}
	}

}
