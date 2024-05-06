package chapter19;

//빈 문자열(empty string)
//길이가 0인 배열 존재 할수 있다
//String 클래스로 되어 있지만 내부적으로 char형 배열을 쓴다
//char형 배열 길이가 0인 배열을 내부적으로 가지고 있는 문자열이 빈 문자열이다
public class EmptyString {
	
	public static void main(String[] args) {
		String str1=null;
		String str2="";//빈 문자열로 초기화
		str2+="문";
		str2+="자";
		str2+="열";
		System.out.println(str2);
		
		//String 클래스의 다양한 메서드
		//int compareTo(String str)
		//문자열(str)과 사전순서로 비교한다
		//같으면 0을, 사전순으로 이전이면 음수(-1)를, 이후면 양수(1)를 반환한다
//		String str3="aaa";
		String str3="ccc";
		String str4="bbb";
		if(str3.compareTo(str4)==0) {
			System.out.println("사전순서가 서로 같습니다");
		}else if(str3.compareTo(str4)<0) {
			System.out.println("str3이 str4보다 사전순서가 빠릅니다");
		}else if(str3.compareTo(str4)>0) {
			System.out.println("str4이 str3보다 사전순서가 빠릅니다");
		}
		//지정된 문자열이 포함되었는지 검사한다
		//boolean contains(CharSequence s)
		String s="abcedfg";
		boolean b=s.contains("bc");
		System.out.println(b);
		
		//boolean equalsIgnoreCase(String str)
		//문자열을 대소문자 구분없이 비교한다
		String s1="Hello";
		boolean b1=s1.equalsIgnoreCase("hello");
		System.out.println(b1);
		b1=s1.equals("hello");
		System.out.println(b1);
		System.out.println("World".equalsIgnoreCase("WORLD"));
		
		//int indexOf(char ch)
		//주어진 문자 문자열에 존재하는지 확인하여 위치를 알려준다
		//못찾으면 -1을 반환한다
		s="Hello";
		int idx1=s.indexOf("o");
		int idx2=s.indexOf("k");
		System.out.println(idx1);
		System.out.println(idx2);
		
		//String replace(String old,String nw)
		//문자열 중의 문자열을 새로운 문자열로 모두 바꾼 문자열을 반환한다
		s="what the hell";
		s1=s.replace("hell", "heaven");
		System.out.println(s1);
		
		//String[] split(String regex)
		//문자열을 지정된 분리자(regex)로 나누어
		//문자열 배열에 담아 반환한다
		//csv파일은 ,로 데이터를 구분한 파일
		String animals="dog,cat,bear";
		String[] arr=animals.split(",");
		//arr=[dog,cat,bear]
		String animal1=arr[1];
		System.out.println(animal1);
		
		//foreach문
		//for(요소를 순차적으로 대입할 변수: 시퀀스형 자료){
		//}
		//배열이 가지고 있는 요소 수 만큼 자동으로 반복
		for(String str : arr) {
			System.out.println(str);
		}
		
		//년-월-일, 성-이름
		//일-월-년, 이름-성
		//22-03-2024
		String today="22-03-2024";
		String[] tArr=today.split("-");
		String temp=tArr[0];
		tArr[0]=tArr[2];
		tArr[2]=temp;
		String ymd="";
		int cnt=0;
		for(String t:tArr) {
			System.out.println(t);
			ymd+=t;
			if(cnt<2) {
				ymd+="-";
			}
			cnt++;
		}
		System.out.println(ymd);
		//join()은 여러 문자열 사이에 구분자를 넣어서 결합한다
		String ymd1=String.join("-", tArr);
		System.out.println(ymd1);
		//프레임워크 - 구조와 라이브러리가 이미 갖추어진 틀
	}

}























