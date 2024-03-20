package chapter07;

public class Movie{
	private String name;
	private String time;
	private int seat;
	
	public void setMovie(String n, String t, int s) {
		name=n;
		time=t;
		seat=s;
	}
	
	public void getMovie() {
		System.out.println("영화이름 : "+name);
		System.out.println("상영시간: "+time);
		System.out.println("남은 좌석: "+seat);
		
	}
	
	public static void main(String[] args) {
		Movie movie1=new Movie();
		movie1.setMovie("파묘", "17:00", 3);
		movie1.getMovie();
		Movie movie2=new Movie();
		movie2.setMovie("듄:파트2", "19:30", 12);
		movie2.getMovie();
	}

}
