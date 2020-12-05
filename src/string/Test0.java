package string;

public class Test0 {

	public static void main(String[] args) {
		String s=" I LOVE JAVA ";
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf('A'));
		System.out.println(s.lastIndexOf('A'));
		System.out.println(s.concat(" and selenium"));
		System.out.println(s.compareTo("Python"));
		System.out.println(s.compareTo(" I LOVE JAVA"));
		System.out.println(s.compareToIgnoreCase(" i love java"));
        System.out.println(s.substring(5));
        System.out.println(s.substring(8,12));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
	}

}
