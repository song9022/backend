package chapter23;

//반환은 없고 매개변수가 둘 인 람다식
public class TwoParamNoReturn {
	public static void main(String[] args) {
		Calculate c;
		//매개변수가 두개이기 때문에 매개변수의 ()소괄호 생략 불가
		//덧셈을 진행
		c=(x,y)->System.out.println(x+y);
		c.cal(4, 3);
		//뺄셈을 진행
		c=(a,b)->System.out.println(a-b);
	}
}
