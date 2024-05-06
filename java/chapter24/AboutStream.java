package chapter24;

import java.util.Arrays;
import java.util.stream.IntStream;

import chapter23.Calculate;

//라이브러리를 가져다 쓰는데 일부분은 내 코드로 커스트마이징해서 
//연계해서 실행시키는 일이 빈번한다
//상속(오버라이딩)와 구현을 통해 했다
//구현 -> 람다식 사용을 할수 있게 업데이트
public class AboutStream {
	public static void main(String[] args) {
		//스트림 - 배열이나 컬렉션을 람다식을 사용할수 있게 만들어 놓은 기능들
		//스트림이란? 스트림을 생성하고 이를 대상으로 중간연산과 최종연산을 진행하면
		//원하는 기준으로 데이터를 필터링하고 필터링 된 데이터의 가공된 결과를 얻는다
		//매우 적은 양의 코드가 사용된다
		int[] ar= {1,2,3,4,5};
		//배열 ar로부터 스트림 생성
		IntStream stm1=Arrays.stream(ar);
		//filter(매개변수가 인터페이스형 참조 변수 선언 되어 있다)
		//인터페이스형 참조 변수에 참조 시킬수 있는 방법 3가지
		//1.인터페이스를 구현한 클래스 생성
		//2.익명 클래스
		//3.람다
		//T 대문자가 하나일 경우 - 제네릭
		//제네릭 - 인스턴스를 참조할수 있는 참조 변수인데 데이터 타입은 고정하지 않는다
		//Object obj(오브젝트 클래스 참조변수)와 유사하지만 더 좋은 기능을 갖춘것이
		//제네릭이다
		//boolean test(T t)
		IntStream stm2=stm1.filter(n->n%2==1);
		int sum=stm2.sum();
		System.out.println(sum);
		//stm1의 배열에서 홀수만 뽑아서 모두 더한다
	}
	public static void filterCopy(Calculate c) {
		
	}
}











