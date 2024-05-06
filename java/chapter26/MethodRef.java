package chapter26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

//메서드 참조
//람다식을 더 간략하게 사용
//메소드(Mothod)참조의 4가지 유형
//1.static 메소드의 참조
public class MethodRef {
	
	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(1,3,5,6,9);
		ls=new ArrayList<>(ls);
		
//		Collections.reverse(ls);
//		for(int i:ls) {
//			System.out.println(i);
//		}
		
		//추상 메소드 한개 가지고 있는 인터페이스 4가지
		//그중 하나:Consumer<T> void accept(T t)
		//컬렉션 프레임워크 - Collections클래스 다양한 기능을 하는 메소드
		//reverse()메소드, 컬렉션의 순서를 뒤집는 기능을 하는 메소드
//		Consumer<List<Integer>> c=l->Collections.reverse(l);
		//static 메소드 참조
		//전달되는 인자를 static메소드를 호출하면서 그대로 전달할 경우
		Consumer<List<Integer>> c=Collections::reverse;
		c.accept(ls);
		System.out.println(ls);
		
	}

}










