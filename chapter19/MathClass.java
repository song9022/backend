package chapter19;

//Math클래스
//기본적인 수학계산에 유용한 메서드로 구성되어 있다
//Math클래스의 생성자는 private이기 때문에 인스턴스 생성할 수 없다
//메서드는 모두 static이다
public class MathClass {
	public static void main(String[] args) {
		//Math의 메서드
		//static double abs(double a)
		//static int abs(int f)
		//주어진 값의 절대값을 반환한다
		int i=Math.abs(-10);
		System.out.println(i);
		i=Math.abs(10);
		System.out.println(i);
		//static duoble ceil(double a)
		//주어진 값을 올림하여 반환한다
		double d=Math.ceil(10.1);
		System.out.println(d);
		double d2=Math.ceil(-10.1);
		System.out.println(d2);
		double d3=Math.ceil(10.000015);
		System.out.println(d3);
		//static double floor(double a)
		//주어진 값을 버림하여 반환한다
		d=Math.floor(10.8);
		System.out.println(d);
		d2=Math.floor(-10.8);
		System.out.println(d2);
		
		//static double random()
		//0.0~1.0범위의 임의의 double값을 반환한다
		//1.0미포함
		d=Math.random();
		System.out.println(d);
		i=(int)(Math.random()*10)+1;//1<=i<11
		System.out.println(i);
		//static long round(double a)
		//소수점 첫째자리에서 반올림한 정수값(long)을 반환한다
		long l=Math.round(1.2);
		System.out.println(l);
		long l2=Math.round(2.6);
		System.out.println(l2);
	}

}











