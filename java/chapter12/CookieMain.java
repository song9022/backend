package chapter12;

//다형성 활용
//자료 구조를 하나로 처리
//메소드 매개변수에 하나의 자료형의 처리
//오버라이드한 메소드를 호출 할 때는 각각에 클래스에 덮어쓴
//메소드가 실행이 된다
public class CookieMain {
	private Cookie[] cookieArr=new Cookie[3];
	private int cnt=0;
	
	public Cookie[] getCookieArr() {
		return cookieArr;
	}

	public void setCookieArr(Cookie[] cookieArr) {
		this.cookieArr = cookieArr;
	}
	
	public void putCookieArr(Cookie cookie) {
		cookieArr[cnt++]=cookie;
	}

	public static void main(String[] args) {
		CookieMain cookieMain=new CookieMain();
		Cookie cookie=new CreamChocoCookie();
		cookieMain.putCookieArr(cookie);
		cookieMain.putCookieArr(new ChocoCookie());
		cookieMain.putCookieArr(new Cookie());
		
		Cookie[] cArr=cookieMain.getCookieArr();
//		for(int i=0;i<cookieMain.getCookieArr().length;i++) {
		for(int i=0;i<cArr.length;i++) {
			cArr[i].whoAreYou();
		}
		
		//참조변수의 형변환
		//서로 상속관계에 있는 타입간의 형변환은
		//양방향으로 자유롭게 수행 될 수 있다                                            
		cArr[0].whoAreYou();
//		cArr[0].getCream();
		//Cookie[] cookieArr
		//cookieArr[0]=new CreamChocoCookie();
		CreamChocoCookie ccc=
				(CreamChocoCookie)cArr[0];
		ccc.getCream();
	}

}















