package chapter12;

//instanceof 연산자
//참조 변수가 참조 하고 있는 인스턴스의 실제 타입을 알아보기 위해
//instanceof 연산자를 사용한다
//참조 변수가 대입 가능한 타입을 알아 보는 연산자
public class InstanceType {

	public static void main(String[] args) {
//		Cookie cookie=new Cookie();
//		Cookie cookie=new ChocoCookie();
		Cookie cookie=new CreamChocoCookie();
		
		if(cookie instanceof CreamChocoCookie) {
			System.out.println("실제 타입은 CreamChocoCookie");
		}else if(cookie instanceof ChocoCookie) {
			System.out.println("실제 타입은 ChocoCookie");
		}else if(cookie instanceof Cookie) {
			System.out.println("실제 타입은 Cookie");
		}
		
		
	}

}











