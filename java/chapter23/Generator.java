package chapter23;

import java.util.Random;

//매개변수가 없고 리턴만 있는 경우
public interface Generator {
	int rand();

	public static void main(String[] args) {
		//매개변수가 없는 경우 소괄호 생략 불가
		Generator gen=()->{
			//랜덤으로 생성해주는 더 간편한 메소드들이 많은 Random라이브러리
			//nextInt() - 정수를 간편하게 랜덤 생성
			//매개변수에 넣은 정수까지의 정수 범위에서 랜덤 생성
			Random rand=new Random();
			return rand.nextInt(43);//1~43의 범위에서 랜덤한 정수 생성
		};
		System.out.println(gen.rand());
		Random rand=new Random();
		gen=()->rand.nextInt(43);
		System.out.println(gen.rand());
		
	}
}











