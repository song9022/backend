package chapter23;

//매개변수가 있고 반환하는 람다식
public interface CalculateWithReturn {
	int cal(int a, int b);
	
	public static void main(String[] args) {
		CalculateWithReturn c;
		//return 키워드나 메소드 몸체가 문장 둘이상일 경우 중괄호 생략 불가
		c=(a,b)->{return a+b;};
		System.out.println(c.cal(4, 2));
		c=(a,b)->{
			int sum=a+b;
			return sum;
		};
		System.out.println(c.cal(4, 2));
		//return문 밖에 없으면 return키워드와 중괄호 생략 가능
//		c=(a,b)->"str";
		c=(a,b)->a+b;//return a+b -> a+b
		System.out.println(c.cal(4, 2));
	}
}















