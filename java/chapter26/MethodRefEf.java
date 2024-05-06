package chapter26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//2.인스턴스 메소드일 경우 메소드 참조 사용 가능
public class MethodRefEf {
	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(1,3,5,6,9);
		ls=new ArrayList<>(ls);
		JustSort js=new JustSort();
//		Consumer<List<Integer>> c=e->js.sort(e);
		//인스턴스 존재 상황에서 메소드 참조 사용 가능
		Consumer<List<Integer>> c=js::sort;
		c.accept(ls);
		System.out.println(ls);
	}

}









