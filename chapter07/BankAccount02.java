package chapter07;

//클래스 = 데이터 + 기능
//인스턴스 변수 : 클래스 내에 선언된 변수
//인스턴스 메소드 : 클래스 내에 정의된 메소드
public class BankAccount02 {
	
	int balance=0;
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	//출금
	public int withdraw(int amount) {
		balance-=amount;
		return balance;
	}
	
	//예금조회
	public int checkMyBalance() {
		System.out.println("잔액 "+balance);
		return balance;
	}
	
	public static void main(String[] args) {
		//클래스는 틀이다
		//클래스를 사용하기 위해서는 인스턴스 생성이 선행
		
		//예시 - A의 통장 발급
		
		//인스턴스 생성
		//클래스이름 변수이름(참조변수) = new 클래스이름(); 
		BankAccount02 ba=new BankAccount02();
		
		//두 개의 인스턴스 생성
		BankAccount02 yoon=new BankAccount02();
		BankAccount02 park=new BankAccount02();

		//각 인스턴스에 데이터 기능이 따로 존재
		//윤님의 계좌
		yoon.deposit(5000);
		yoon.checkMyBalance();
		
		//박님의 계좌
		park.checkMyBalance();
		
		//인스턴트를 대입하고 있는 편수 : 참조 변수
		//참조 변수의 특성
		BankAccount02 kim=new BankAccount02();
		kim.deposit(4200);
		kim.checkMyBalance();
		BankAccount02 ref1=kim;
		ref1.checkMyBalance();
		
		check(yoon);
		check(park);
		check(kim);
		check(ref1);
		
		a_BankAccount bankAccount=new a_BankAccount();
//		check(bankAccount); (X)
		
		check(new BankAccount02());
		
		int num1=42;
		getInt(num1);
		getInt(42);
		
		//객체에는 null을 대입 가능
		BankAccount02 choi=null;
		choi=new BankAccount02();
		//null 저장 유무에 대한 비교 연산 가능
		bankAccount02 ref3=null;
		if(ref3==null) {
			ref3=new BankAccount02();
		}
//		BankAccount02 ref4=new a_BankAccount(); (X)
//		BankAccount02 ref5=new Book(); (X)
	}

	public static void check(BankAccount02 acc) {
		//acc=yoon;
		acc.checkMyBalance();
	}
	
	public static void getInt(int num) {
		System.out.println(num);
	}

}






