package chapter27;

public class ShowCompAddr {
	
	//친구 회사 근처에서 점심을 먹기로 했다
	//친구 회사 주소를 보여주는 메소드 작성
	public void showCompAdder(Friend f) {
		String addr=null;
		if(f!=null) {
			Company com=f.getCmp();
			//70% 일을 쉬고 있어서 회사 정보가 없다
			if(com!=null) {
				ContInfo info=com.getcInfo();
				if(info!=null)//회사 주소가 없을 수도 있다
					addr=info.getAddr();
			}
		}
		//위의 코드에서 주소 정보를 얻지 못했을 수 있다
		if(addr!=null) {
			System.out.println(addr);
		}else {
			System.out.println("There's no address information.");
		}
	}
	
	public static void main(String[] args) {
		//NullPointerException 예외의 발생 상황이 실제적으로 꽤 많다
		//null 가능성에 대비하는 코드의 작성은 번거롭고
		//그 코드 스타일도 만족스러운 편이 아니다
		//=>이를 해결하기 위해 등장한 것이 Optional클래스
	}
	

}












