package bonus;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		B b = new B();
		List<Object> list = Arrays.asList(1,2,3);
		b.addAll(list);
		System.out.println(b.getAddCount()+b.getI());
	}
}
