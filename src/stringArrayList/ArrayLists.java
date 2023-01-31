package stringArrayList;

import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {
		String[] s = { "Ann", "Andrew", "Max" };
		List list = Arrays.asList(s); // связанний с массивом
//	ArrayList list = new ArrayList(Arrays.asList(s));// автономний лист
		System.out.println(list);
		System.out.println(Arrays.toString(s));
		s[0] = "John";
		list.set(1, "Ann");
		System.out.println(list);
		System.out.println(Arrays.toString(s));
//		list.add("Den");			//	exception
		//
		ArrayList al = new ArrayList();
		al.add(5);al.add("Serg");
		String s1 = (String)al.get(1);
		System.out.println(s1);
	}
}