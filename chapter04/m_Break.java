package chapter04;

public class m_Break {
	public static void main(String[] args) {
		//break문
		//반복문과 switch문에서 break문을 사용하여 종료
		/*
		 * for(...) {
		 * 	break; //종료
		 *  }
		 * */
		
		// 주사위를 굴려서 나올 수 있는 하나의 수를 무작위로 뽑아서 출력하는 프로그램 작성
		// 임의의 정수를 뽑는다
		// Math.random() 메소드(함수) 활용
		
		// 0.0과 1.0 사이에 속하는 double 타입의 난수 하나 리턴
		System.out.println(Math.random());
		// 1~10사이의 정수 중에서 하나의 정수를 얻기 위해 10을 곱한다.
		System.out.println(Math.random()*10);
		//int 타입으로 형 변환하면 정수값을 얻을 수 있다.
		System.out.println((int)(Math.random()*10));
		//1~10 사이의 정수 얻기
		System.out.println((int)(Math.random()*10)+1);
		//응용: start부터 시작하는 n개의 정수 중 임의의 정수 하나를 얻기 위한 연식
//		(int)(Math.random()*n)+start
		
		// 주사위 번호 하나를 뽑기 위해서 : 
		int num=(int)(Math.random()*6)+1;
		System.out.println("랜덤 주사위: "+num);
		
		//1부터 100까지의 정수 중에서 3의 배수의 총합
		int s=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
//				System.out.println(i);
				s+=i;
			}
		}
		
		//디버깅 방법
		//디버깅 : 컴퓨터 프로그램 개발 단계 중 발생하는 시스템의 논리적인 오류나 비정상적인 연산(버그)을 찾아내고 수정하는 과정
		//1.디버깅 툴 사용
		//2.콘솔에 출력
		
		
		
	}

}









