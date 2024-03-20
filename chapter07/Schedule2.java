package chapter07;

public class Schedule2 {
	private String subject;
	private String time;
	private String teacher;
	private String place;
	

	
	public Schedule2(String subject, String time, String teacher, String place) {
		super();
		this.subject = subject;
		this.time = time;
		this.teacher = teacher;
		this.place = place;
	}



	@Override
	public String toString() {
		return "Schedule2 [subject=" + subject + ", time=" + time + ", teacher=" + teacher + ", place=" + place + "]";
	}


	public static void main(String[] args) {
		Schedule2 sc2=new Schedule2("인문의 이해", "09:00~11:00", "김자바", "302호");
		System.out.println(sc2.toString());
	}

}
