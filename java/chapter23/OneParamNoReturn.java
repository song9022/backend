package chapter23;

//매개변수가 있고 반환하지 않는 람다식
public class OneParamNoReturn {
	public static void main(String[] args) {
		Printable p;
		//줄임 없는 표현 
		p=(String s)->{
			System.out.println(s);
		};
		p.print("Lambda exp one.");
		//중괄호 생략 - 메소드 몸체가 하나의 문장이면
		p=(String s)->System.out.println(s);
		p.print("Lambda exp two.");
		//매개변수 형 생략
		p=(s)->System.out.println(s);
		p.print("Lambda exp three.");
		//매개변수 소괄호 생략 - 매개변수의 수가 하나인 경우
		p=s->System.out.println(s);
		p.print("Lambda exp four.");
	}
}











