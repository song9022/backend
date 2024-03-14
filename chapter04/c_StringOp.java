package chapter04;

public class c_StringOp {
	public static void main(String[] args) {
		// 문자열 연산자+ - 문자열 결합 연산자(+)
		// 피연산자 중 한쪽이 문자열이면 + 연산자는 문자열 결합 연산자가 된다
		// 다른 피연산자를 문자열로 변환하고 서로 결합
		System.out.println("문자열"+42);
		System.out.println(42+"문자열"); // 위아래 차이 x
		System.out.println(10+10+"문자열");

		String str1=10+"문자열"; // 컨파일 에러x
//		String str2=10 // 컨파일 에러o
		
		int n1=10;
		String str3="문자열";
		String str4=n1+str3;
		
	}

}
