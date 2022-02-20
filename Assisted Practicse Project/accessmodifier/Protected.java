package accessmodifier;
public class Protected {
	 protected void display() {
		System.out.println("PROTECTED ACCESS ");
	}
}
class Protect extends Protected {
	public static void main(String[] args)
	{
		Protect ooc = new Protect ();
		ooc.display();
	}


}
