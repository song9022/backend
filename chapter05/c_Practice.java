package chapter05;

public class c_Practice {
	public static void main(String[] args) {
		while (true) {
			int dice=(int)(Math.random()*6)+1;
			int dice2=(int)(Math.random()*6)+1;
			System.out.println(dice+","+dice2);
			if(dice+dice2==5) {
				break;
			}
		}
	}

}
