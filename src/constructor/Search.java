package constructor;

public class Search {
	
	Search(String email)
	{
		System.out.println("emails");
	}
	
	Search(String keywords,int numbers)
	{
		System.out.println("keywords,numb");
	}
	
	Search(int numb ,String names)
	{
		System.out.println("numb and names");
	}
	
	
	public static void main(String[] args) {
		Search s=new Search(6578, "names");
		Search s1=new Search("keywords",67);

	}

}
