package chapter11;

public class Student {
	//6-1 클래스 정의
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math;
	}
	
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
	}
	
}
