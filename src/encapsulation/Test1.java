package encapsulation;

public class Test1 {

	public static void main(String[] args) {
	Test0 t=new Test0();
	System.out.println(t.getEmailId());
	t.setEmailId("java@gmail.com");
	System.out.println(t.getEmailId());
	
	System.out.println(t.getPassWord());
	t.setPassWord(9876654);
	System.out.println(t.getPassWord());

	}

}
