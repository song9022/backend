package chapter05;

public class ArrayCreate {

	public static void main(String[] args) {
		//배열
		//변수는 1개의 데이터만 저장
		//저장해야 할 데이터의 수가 많아지면
		//그만큼 많은 변수가 필요하고 코드도 매우 길어집니다
		//많은 양의 데이터를 적은 코드로 손쉽게 처리할 수 있는
		//배열(array)이 있다
		
		//배열이란?
		//배열은 같은 타입의 데이터를 연속된 공간에 나열하고
		//각 데이터에 인덱스를 부여해놓은 자료구조입니다
		//배열의 특징
		//1. 배열은 같은 타입의 데이터만 저장할 수 있다
		//2. 한 번 생성된 배열은 길이를 늘리거나 줄일 수 없습니다
		
		//배열 선언
		//배열 변수 선언은 두가지 형식이 있다
		//1. 타입[] 변수
		//2. 타입 변수[]
		int[] intArray;
		double[] doubleArray;
		String[] strArray;
		
		int intArr[];
		double doubleArr[];
		String strArr[];
		
		String name1="신용권";
		String name2="홍길동";
		String name3="김자바";
		//배열 생성
		//1. 값 목록으로 배열 생성
		String[] names= {"신용권","홍길동","김자바"};
		//읽어 오는 방법 - 참조
		//배열변수이름[인덱스값]
		//인덱스는 각 항목의 데이터를 읽거나 저장하는 데
		//사용되며 배열 이름 옆에 대괄호[]에 기입
		//인덱스는 0부터 시작합니다
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
		
		String[] fruits={"바나나","사과","딸기"};
//		String[] fruits={"바나나","사과","딸기",3,3,14};(X)
		//콘솔에 사과 딸기 바나나 순으로 출력해 보세요
//		System.out.println(fruits[1]);
//		System.out.println(fruits[2]);
//		System.out.println(fruits[0]);
		fruits[0]="수박";
//		System.out.println(fruits[0]);
		
		int[] scores= {83,90,87};
		
//		System.out.println("scores[0]: "+scores[0]);
//		System.out.println("scores[1]: "+scores[1]);
//		System.out.println("scores[2]: "+scores[2]);
		
		//모든 점수를 콘솔에 출력
//		int[] scores= {83,90,87};
		for(int i=0;i<3;i++) {
//			System.out.println(i);
//			System.out.println(scores[i]);
		}
		//모든 점수의 합
		int sum=0;
		for(int i=0;i<3;i++) {
			sum+=scores[i];
		}
		System.out.println("총합: "+sum);
//		int sum1=scores[0]+scores[1]+scores[2];
		//평균 점수 구하기 - 총합/갯수
		double avg=sum/3;
		System.out.println("평균 :"+avg);
		
		//2. 한 번 생성된 배열은 길이를 늘리거나 줄일 수 없습니다
		String[] colors= {"검정색","빨간색","녹색","파란색"};
		//colors 배열에서 사용할 수 있는 인덱스 값의 범위: 0~3
//		System.out.println(colors[-1]);
//		colors[4]="노란색";
		for(int i=0;i<4;i++) {
			System.out.println(colors[i]);
		}
		
	}

}










