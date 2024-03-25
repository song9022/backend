package chapter05;

public class ArrayLength {

	public static void main(String[] args) {
		//배열 길이
		//배열에 저장할 수 있는 전체 항목의 개수
		int[] intArray= {10,20,30};
		System.out.println(intArray.length);
		//배열 객체(class) length 속성(field)
		//배열 안에 있는 일종의 변수 length는
		//배열 길이는 담고 있다
		//System.out.println();
		//Math.random();
		String[] fruits= {"사과","바나나","배"};
		System.out.println(fruits.length);
		//배열변수.length
		
		//과목 수가 변경 됐을 때: 수정 2군데
		//scores.length
		//length변수를 사용 함으로써
		//코드 수정이 발생 했을 때
		//수정할 부분이 생기지 않았으므로 훨씬 좋은 코드
		int[] scores= {83,90,87,93,70};
		
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		System.out.println("총합: "+sum);
		double avg=sum/scores.length;
		System.out.println("평균 :"+avg);
		
		int[] intArr=new int[10];
		for(int i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]);
		}
	}

}













