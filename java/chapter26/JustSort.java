package chapter26;

import java.util.Collections;
import java.util.List;

public class JustSort {
	//? - 와일드 카드(제네릭 문법중 하나)
	//Object
	public void sort(List<?> lst) {
		Collections.reverse(lst);
	}

}
