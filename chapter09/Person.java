package chapter09;

public class Person {
	String name;
	int age;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		//나이를 음수로 입력 할 때 막아주는 코드 작성 가능 - 데이터 제약 사항 체크
		if (age<0) {
			System.out.println("나이는 음수로 입력할 수 없습니다.");
			return;
		}
		this.age = age;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	

}
