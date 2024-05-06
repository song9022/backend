package review.phonebook;

public class CustomController extends PersonController{
	
	//커스텀한 출력 만들기
	//상속을 통한 메소드 오버라이드
	@Override
	public void getPersons() {
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
	//상속, 인터페이스, 람다

}
