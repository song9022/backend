package chapter07;

public class EatingList {
	private String name;
	private double kal;
	private int price;
	
	public void setEatingList(String n, double k, int p) {
		name=n;
		kal=k;
		price=p;
	}
	
	public void getEatingList() {
		System.out.println("음식 이름: "+name);
		System.out.println("칼로리 : "+kal+"kal");
		System.out.println("금액: "+price);
	}
	
	public static void main(String[] args) {
		EatingList eatinglist1=new EatingList();
		eatinglist1.setEatingList("햄버거", 350, 2700);
		eatinglist1.getEatingList();
		EatingList eatinglist2=new EatingList();
		eatinglist2.setEatingList("콜라", 280, 1200);
		eatinglist2.getEatingList();
	}

}
