package collections;

import java.util.TreeMap;

public class Test12 {

	public static void main(String[] args) {
		TreeMap<String,Integer>t=new TreeMap<String,Integer>();
		t.put("Ram",123);
		t.put("Ham",456);
		t.put("Jam",789);
		t.put("Dam",900);
		t.put("Wam",500);
		t.put("Ham",456);
		t.put("Man",500);
		System.out.println(t);
		System.out.println(t.keySet());
		System.out.println(t.values());


	}

}
