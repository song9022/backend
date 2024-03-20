package chapter07;

public class MovieGS{
	private String name;
	private String time;
	private int seat;
	

	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	public int getSeat() {
		return seat;
	}



	public void setSeat(int seat) {
		this.seat = seat;
	}



	@Override
	public String toString() {
		return "MovieGS [name=" + name + ", time=" + time + ", seat=" + seat + "]";
	}



	public static void main(String[] args) {
		MovieGS mgs=new MovieGS();
		mgs.setName("파묘");
		mgs.setTime("13:00");
		mgs.setSeat(3);
		System.out.println(mgs.toString());
	}

}
