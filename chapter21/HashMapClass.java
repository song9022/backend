package chapter21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map 컬렉션
//키(key)와 값(value)으로 구성된 객체를 저장하는 구조를 가지고 있다
//키는 중복 저장될 수 없지만 값은 중복 저장될 수 있습니다
//만약 기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고
//새로운 값으로 대체 됩니다
//키와 값의 타입은 래퍼 클래스를 사용(Integer)
public class HashMapClass {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		//Map<키,값>
		//객체 저장 - put()
		map.put("홍길동", 85);
		map.put("동장군", 90);
		map.put("김자바", 90);
		map.put("홍길동", 95);
		//저장된 총 요소 수 얻기 - size()
		System.out.println("총 요소 수: "+map.size());
		
		//객체 찾기(얻기) - get(키) -> 값이 반환 됨
		System.out.println("홍길동 :"+map.get("홍길동"));
		
		//반복문은 이터레이터 사용
		//모든 키 값을 set컬렉션으로 변환
		//key set 얻기 - key.set()
		Set<String> keySet=map.keySet();
		for(String s:keySet) {
			System.out.println(s);
		}
		Iterator<String> kItr=keySet.iterator();
		while(kItr.hasNext()) {
//			System.out.println(kItr.next());
//			String key=kItr.next();
			System.out.println(map.get(kItr.next()));
		}
		
		//요소 삭제 - remove(키)
		map.remove("홍길동");
		System.out.println("총 요소 수: "+map.size());
		
	}

}












