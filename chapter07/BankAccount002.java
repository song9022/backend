package chapter07;

//클래스 = 데이터+기능
//인스턴스 변수 - 클래스 내에 선언된 변수
//인스턴스 메소드 - 클래스 내에 정의된 메소드
public class BankAccount002 {
	int balance=0;
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance-=amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액: "+balance);
		return balance;
	}

	public static void main(String[] args) {
		//클래스는 틀이다
		//클래스를 사용하기 위해서는 인스턴스 생성
		//A란 사람의 통장 발급
		//인스턴스 생성
		//클래스이름 변수이름(참조변수) = new 클래스이름();
		BankAccount002 ba=new BankAccount002();
		
		//두 개의 인스턴스 생성
		BankAccount002 yoon=new BankAccount002();
		BankAccount002 park=new BankAccount002();
		//각 인스턴스에 데이터 기능이 따로 존재 한다
		//윤님의 계좌
		yoon.deposit(5000);
		yoon.checkMyBalance();
		//박님의 계좌
		park.checkMyBalance();
		
		//인스턴스를 대입하고 있는 변수 - 참조 변수
		//참조변수의 특성
		BankAccount002 kim=new BankAccount002();
		kim.deposit(4200);
		kim.checkMyBalance();
		BankAccount002 ref1=kim;
		ref1.checkMyBalance();
		
		check(yoon);
		check(park);
		check(kim);
		check(ref1);
		
		BankAccount bankAccount=new BankAccount();
//		check(bankAccount);(X)
		
		check(new BankAccount002());
		
		int num1=42;
		getInt(num1);
		getInt(42);
		
		//객체에는 null을 대입 가능
		BankAccount002 choi=null;
		choi=new BankAccount002();
		//null 저장 유무에 대한 비교 연산 가능
		BankAccount002 ref3=null;
		if(ref3==null) {
			ref3=new BankAccount002();
		}
//		BankAccount002 ref4=new BankAccount();(X)
//		BankAccount002 ref5=new Book();(X)
	}
	
	public static void check(BankAccount002 acc) {
		//acc=yoon;
		acc.checkMyBalance();
	}
	
	public static void getInt(int num) {
		System.out.println(num);
	}

}











