package chapter23;

//매개변수가 있고 반환하는 람다식2
public interface HowLong {
	int len(String s);
	
	public static void main(String[] args) {
		HowLong hl=s->s.length();//return s.length()
		System.out.println(hl.len("I am so happy"));
	}

}
