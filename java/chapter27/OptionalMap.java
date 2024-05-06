package chapter27;

import java.util.Optional;

public class OptionalMap {
	public static void main(String[] args) {
		//Optional 클래스의 map 메소드
		Optional<String> os1=Optional.of("Optional String");
		//toUpperCase() - String클래스의 메소드이고 대문자로 변환
		//map() - 맵핑해주는 역활
		//반환하는 대상을 Optional 인스턴스에 담아서 반환
		Optional<String> os2=os1.map(s->s.toUpperCase());
		System.out.println(os2.get());
		
		Optional<String> os3=os1.map(s->s.replace(' ','_'))
				.map(s->s.toLowerCase());
		System.out.println(os3.get());
		
		//flatMap 메소드 - 감쌌던 인스턴스 그 자체로 그냥 반환
		Optional<String> os4=Optional.ofNullable("Optional String");
		Optional<Object> str=os4.flatMap(s->Optional.of(s.toLowerCase()));
	}

}















