package chapter07;

//운동 한개를 저장하는 클래스
public void Workout {
	private String name;
	private int set;
	private int time;
	private String rest;
	
	public void setWorkout(String n, int s, int t, String r){
		name=n;
		set=s;
		time=t;
		rest=r;
	}
	
	public void getWorkout() {
		System.out.println("운동이름: "+name);
		System.out.println("세트: "+set+"횟수: "+time+"총 횟수: "+set*time);
		System.out.println("휴식시간: "+rest+"분");
	}

	public static void main(String[] args) {
		workout workout1=new workout();
		workout1.setWorkout("바벨 벤치 프레스", 4, 10, "2");
		workout1.getWorkout();
		
	}

}
