package chapter21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//List<>인터페이스를 구현하는 클래스
//ArrayList, LinkedList
//ArrayList - 특정 인덱스의 객체를 제거하면 바로 뒤 인덱스부터
//마지막 인덱스까지 모두 앞으로 1씩 당겨집니다
//특정 인덱스에 객체를 삽입하면 해당 인덱스부터 마지막 인덱스까지 모두 1씩 밀려납니다
//=>객체를 찾거나 맨 마지막에 객체를 추가하는 경우에는 좋은 성능을 발휘한다
//LinkedList
//특정 인덱스의 객체를 제거하면 앞뒤 링크만 변경되 나머지 링크는 변경되지 않는다
//삽입할 때에도 마찬가지다
//=>특정 인덱스에 객체를 추가하거나 제거하는 일이 빈번할때 좋은 성능을 발휘한다
public class LinkedListClass {
	
	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		List<String> list2=new LinkedList<String>();
		
		
		//add()-메소드 오버로딩
		//add(E element)-add(넣을려는 요소)
		//add(int index, E element)
		
		long startTime;
		long endTime;
		startTime=System.nanoTime();
		for(int i=0;i<10000;i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList 걸린시간: "
				+(endTime-startTime)+" ns");
		
		startTime=System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("LinkedList 걸린시간: "
				+(endTime-startTime)+" ns");
	}

}













