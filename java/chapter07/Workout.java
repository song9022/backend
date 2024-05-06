package chapter07;

//운동 한개를 저장하는 클래스
public class Workout {
	private String name;
	private int set;
	private int times;
	private String rest;
	
	public void setWorkout(String n,int s,int t, String r){
		name=n;
		set=s;
		times=t;
		rest=r;
	}
	public void getWorkout() {
		System.out.println("운동 이름:"+name);
		System.out.println("세트:"+set+", 횟수: "+times
				+", 총횟수: "+set*times);
		System.out.println("휴식 시간: "+rest+"분");
	}

	public static void main(String[] args) {
		Workout workout1=new Workout();
		workout1.setWorkout("바벨 벤치 프레스",
				4, 10, "2");
		workout1.getWorkout();
		Workout workout2=new Workout();
		workout2.setWorkout("펙 덱 플라이",
				4, 15, "1");
		workout2.getWorkout();
	}

}








