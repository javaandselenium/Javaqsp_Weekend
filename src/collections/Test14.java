package collections;

import java.util.LinkedHashMap;

public class Test14 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer>t=new LinkedHashMap<String,Integer>();
		t.put("Ram",123);
		t.put("Ham",456);
		t.put("Jam",789);
		t.put("Dam",900);
		t.put("Wam",500);
		t.put("Ham",456);
		t.put("Man",500);
		System.out.println(t);

	}

}
