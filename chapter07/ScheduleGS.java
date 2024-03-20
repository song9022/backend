package chapter07;

public class ScheduleGS {
	private String subject;
	private String time;
	private String teacher;
	private String place;
	

	
	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	public String getTeacher() {
		return teacher;
	}



	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}



	public String getPlace() {
		return place;
	}



	public void setPlace(String place) {
		this.place = place;
	}



	@Override
	public String toString() {
		return "ScheduleGS [subject=" + subject + ", time=" + time + ", teacher=" + teacher + ", place=" + place + "]";
	}



	public static void main(String[] args) {
		ScheduleGS sgs=new ScheduleGS();
		sgs.setSubject("인문의 이해");
		sgs.setTime("09:00~11:00");
		sgs.setTeacher("김자바");
		sgs.setPlace("302호");
		System.out.println(sgs.toString());

	}

}
