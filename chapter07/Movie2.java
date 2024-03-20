package chapter07;

public class Movie2{
	private String name;
	private String time;
	private int seat;
	

	
	public Movie2(String name, String time, int seat) {
		super();
		this.name = name;
		this.time = time;
		this.seat = seat;
	}



	@Override
	public String toString() {
		return "Movie2 [name=" + name + ", time=" + time + ", seat=" + seat + "]";
	}



	public static void main(String[] args) {
		Movie2 m2=new Movie2("파묘", "13:00", 3);
		System.out.println(m2.toString());
	}

}
