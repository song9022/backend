package chapter12;

public class SmartTv extends Tv{
	//자막을 보여주는 기능을 추가
	boolean caption;
	
	public void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}

}
