package chapter09;

//정보은닉
//객체 지향 언어의 4대 특징
// 1. 추상화 2.캡슐화 3.상속성 4.다형성
//기능별로 코드를 모아 두는 것이 가장 좋다(캡슐화)
//응집도▲ 결합도 ▼
//유지 보수성과 확장성이 좋아진다

//정보은닉(캡슐화)

    public class Circle {
    	
    //데이터 - filed
	private double rad;
	private final double PI;
	
	
	
	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	public double getPI() {
		return PI;
	}

	public Circle(double r) {
		rad=r;
		PI=3.14;
	}
	
	//기능
	public double getArea() {
		return (rad*rad)*PI;		
	}

}
