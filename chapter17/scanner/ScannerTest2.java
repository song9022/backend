package chapter17.scanner;

import java.util.Scanner;

public class ScannerTest2 {
	
	public static void main(String[] args) {
		//Scanner 클래스의 콘솔 입력 적용
		Scanner sc=new Scanner(System.in);
		//콘솔에서 정수 값 추출
		System.out.print("정수값 입력: ");
		int num1=sc.nextInt();
		System.out.println("입력한 정수값: "+num1);
	}

}
