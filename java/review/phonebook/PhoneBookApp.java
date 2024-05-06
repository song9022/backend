package review.phonebook;

import java.util.List;

public class PhoneBookApp {
	
	public static void getPersons(PersonController pc) {
		pc.getPersons();
	}
	
	public static void main(String[] args) {
		PersonController pc=new PersonController();
		pc.putPerson("김자바1","010-...1");
		pc.putPerson("김자바2","010-...2");
		pc.putPerson("김자바3","010-...3");
//		pc.getPersons();
		getPersons(pc);
		
		//phonebook 라이브러리 배포 했을 때
		//배포 받은 개발자가 출력을 자기만의 스타일로 만들고 싶을 때
		//출력만 나만의 스타일로 만들기
		//1. 상속
		CustomController cc=new CustomController();
		cc.putPerson("김자바1","010-...1");
		cc.putPerson("김자바2","010-...2");
		cc.putPerson("김자바3","010-...3");
		getPersons(cc);
		
		//2. 인터페이스
		PrintPersonImpl ppi=new PrintPersonImpl();
		pc.printPersons(ppi);
		
		//1,2,3 방식은 사실 스크립트 개발자가 봤을 때 너무 복잡하고 번거롭다
		//3. 익명 클래스
		System.out.println("익명 클래스");
		pc.printPersons(new PrintPerson() {
			@Override
			public void printPersons(List<Person> persons) {
				for(Person person:persons) {
					System.out.println("-------------");
					System.out.print("이름: ");
					System.out.print(person.getName());
					System.out.println();
					System.out.print("전화번호:");
					System.out.print(person.getPhone());
					System.out.println();
					System.out.println("-------------");
				}
			}
		});
		//자바 1.8 람다식
		//4. 람다식
		System.out.println("람다식");
		pc.printPersons(persons->{
			for(Person person:persons) {
				System.out.println("-------------");
				System.out.print("이름: ");
				System.out.print(person.getName());
				System.out.println();
				System.out.print("전화번호:");
				System.out.print(person.getPhone());
				System.out.println();
				System.out.println("-------------");
			}
		});
	}

}










