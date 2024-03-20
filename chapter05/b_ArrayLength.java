package chapter05;

public class b_ArrayLength {
	public static void main(String[] args) {
		//배열 길이
		//배열에 저장할 수 있는 전체 항목의 개수
		int[] intArray= {10,20,30};
		System.out.println(intArray.length);
		//배열 객체(class) length 속성(field)
		//배열 안에 있는 일종의 변수 length는 배열 길이를 담고 있다.
		
		String[] fruits= {"사과","바나나","배"};
		System.out.println(fruits.length);
		//배열변수.length
		
		//원래 내용이라면 과목수 변동시 수정 2곳
		//lengt 변수를 사용함으로써 코드 수정이 발생했을 때 수정할 부분이 발생x
		// 아래 스코어에 점수 추가만 하면 됨.
		int[] score= {83,90,87};
		
		int sum=0;
//		for(int i=0;i<3;i++) 아래로 수정
		for (int i=0;i<score.length;i++){
			sum+=score[i];
		}
		System.out.println("총합 : "+sum);
//		double avg=sum/3; 아래로 수정
		double avg=sum/score.length;
		System.out.println("평균 : "+avg);
		
		int[] intArr=new int[10];
		for(int i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]);
		}
		
	}

}








