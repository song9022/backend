package chapter05;

public class a_ArrayCreate {
	public static void main(String[] args) {
		//변수는 1개의 데이터만 저장
		//저장해야할 데이터의 수가 많아지면
		//그만큼 많은 변수가 필요, 코드가 길어짐
		//많은 양의 데이터를 적은 코드로 손십게 처리할 수 있는 방법 :
		// 배열(Array)
		
		// ? 배열 :
		//같은 타입의 데이터를 연속된 공간에 나열하고 각 데이터에 인덱스를 부여해놓은 자료구조
		
		//특장
		//1. 같은 타입의 데이터만 저장할 수 있다.
		//2.한 번 생성된 배열은 길이를 늘리거나 줄일 수 X
		
		//배열 선언
		//형식 1 : 타입[] 변수
		//형식 2 : 타입 변수[]
		
		int[] intArray;
		double[] doubleArray;
		String[] strArray;
		
		int intArr[];
		double doubleArr[];
		String strArr[];
		
		//배열 생성
		//1. 값 목록으로 배열 생성
		String name1="신용권";
		String name2="홍길동";
		String name3="김자바";
		//
		String[] names= {"신용권","홍길동","김자바"};
		
		//읽어오는 방법 - 참조
		//배열변수이름[인덱스값]
		//인덱스는 각 항목의 데이터를 읽거나 저장하는 데 사용되면 배열 이름 옆에 대괄호[]에 기입
		// 인덱스는 0부터 시작
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		String[] fruits= {"바나나","사과","딸기"};
//		String[] fruits= {"바나나","사과","딸기",3,3,14}; <X
		//콘소ㅓㄹ에 사과 딸기 바난 순으로 정렬해주세요
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[0]);
		
		fruits[0]="수박";
		System.out.println(fruits[0]);
		
		int[] scores= {83,90,87};
		
		System.out.println("scores[0] : "+scores[0]);
		System.out.println("scores[1] : "+scores[1]);
		System.out.println("scores[2] : "+scores[2]);
		
		//모든 점수를 콘솔에 출력
		for (int i=0;i<3;i++) {
//			System.out.println(i);
			System.out.println(scores[i]);
		}
		
		// 모든 점수의 합
		int sum=0;
		for (int i=0;i<3;i++) {
			sum+=scores[i];
		}
			System.out.println("총합 : "+sum);
			
			//평균점수 구하기 - 총합/갯수
			double avg=sum/3;
			System.out.println("평균 : "+avg);
			
			String[] colors= {"검정","빨강","녹색","파랑"};
			//colors 배열에서 사용할 수 있는 인덱스 값의 범위 : 0~3
//			System.out.println(colors[-1]); (X)
//			colors[4]="노란색"; < 불가
			for(int i=0;i<4;i++) {
				System.out.println(colors[i]) ;
			}
		
		
		
	}

}









