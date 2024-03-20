package chapter12;

public class SmartTv2 extends Tv2 {
	private boolean netflix;
	
	public boolean isNetflix() {
		return netflix;
	}

	public void setNetflix(boolean netflix) {
		this.netflix = netflix;
	}

	public static void main(String[] args) {
//		Tv2 tv2=new Tv();
//		int num=0.0;
		Tv2 tv2=new Tv2();
		SmartTv2 smartTv2=new SmartTv2();
		//인스턴스 타입과 참조 변수의 타입이 일치 되어야 한다
		Tv2 sTv2=new SmartTv2();
//		Tv2 sTv21=new SmartTv();
		//서로 상속 관계에 있을 경우
		//상위 클래스 타입의 참조변수로 하위 클래스의 인스턴스를
		//참조하도록 하는 것도 가능하다
		//상위 클래스타입의 참조변수로 하위클래스 인스턴스를 참조하게 되면
		//상위 클래스의 멤버들만 사용할 수 있다
		//Tv2타입의 참조변수로는 Tv클래스의 멤버만 사용할 수 있다
		Tv2 sTv2_2=new SmartTv2();
//		sTv2_2.setNetflix();
		sTv2_2.setPower(true);
		//=>둘 다 같은 타입의 인스턴스지만 참조변수의 타입에 따라
		//사용할 수 있는 멤버의 개수가 달라진다
		//하위 클래스 참조변수로 상위 클래스 인스턴스 참조가 가능할까?
//		SmartTv2 smartTv22=new Tv2();
		//에러. 허용 안됨.
	}
}






















