package review.phonebook;

import java.util.List;

//라이브러리 배포를 받은 개발자
public class PrintPersonImpl implements PrintPerson{

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

}
