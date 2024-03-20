package chapter07;

public class Schedule {
	private String subject;
	private String time;
	private String teacher;
	private String place;
	
	public void setSchedule(String s, String t, String te, String p) {
		subject=s;
		time=t;
		teacher=te;
		place=p;
	}
	
	public void getSchedule() {
		System.out.println("과목: "+subject);
		System.out.println("학습시간 :"+time);
		System.out.println("담당교수: "+teacher);
		System.out.println("장소 :"+place);
	}
	
	public static void main(String[] args) {
		Schedule schedule1=new Schedule();
		schedule1.setSchedule("인문의 이해", "09:00~11:00", "김뫄뫄", "301호");
		schedule1.getSchedule();
		Schedule schedule2=new Schedule();
		schedule2.setSchedule("심화 세계사", "14:00~17:00", "김라라", "703호");
		schedule2.getSchedule();
	}

}
