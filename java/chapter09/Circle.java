package chapter09;

//객체 지향 언어의 4대 특징
//1. 추상화 2. 캡슐화 3. 상속성 4. 다형성
//기능별로 코드를 모아 두는 것이 가장 좋다
//캡슐화 - 기능별로 코드를 모은다
//응집도는 높아 지고 결합도는 낮아 진다
//유지 보수성과 확장성이 좋아 진다
//정보 은닉(캡슐화) 
public class Circle {
	
	//데이터 - field
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



