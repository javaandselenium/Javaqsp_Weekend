package methods;

public class WhatsUpold {
	public void status() {
		System.out.println("Text msg");
	}

}

class WhatsUpnew extends WhatsUpold
{
	public void status()
	{
		System.out.println("photos,video,doc");
	}
}

class Mainclass
{
	public static void main(String[] args) {
		WhatsUpnew w=new WhatsUpnew();
		w.status();
	}
}
