package chapter07;

import java.security.PublicKey;

public class a_BankAccount {

		//클래스와 인스턴스
		//C언어 계열 : 포인터
		//객체 지향 언어 : 클래스
		
		//프로그램의 기본 구성
		//데이터 - 프로그램상에서 유지하고 관리해야 할 데이터 
		//기능 - 데이터를 처리하고 조작하는 기능
		
		//간단한 예금인출 프로그램
		//예금 잔액 - 데이터
		static int balance=0;
		
		public static void main(String[] args) {
			//입금 진행
			deposit(10000);
			//잔액확인
			checkMyBalance();
			// 출금진행
			withdraw(3000);
			//잔액홛인
			checkMyBalance();
			//다수의 사람에게 발급되는 통장에 적절치 않은 코드
			//데이터 + 기능 = 클래스
			
		}

		//기능
		//입금
		public static int deposit(int amount) {
			balance += amount;
			return balance;
		}
		
		//출금
		public static int withdraw(int amount) {
			balance-=amount;
			return balance;
		}
		
		//예금조회
		public static int checkMyBalance() {
			System.out.println("잔액 "+balance);
			return balance;
		}
		
		
	}


