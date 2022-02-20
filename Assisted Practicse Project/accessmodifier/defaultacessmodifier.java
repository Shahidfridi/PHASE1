package accessmodifier;

  public class defaultacessmodifier
 {
	  void display ()
			{
				System.out.println("DEFAULT ACCESS");
			}
 }
  class defaultacessmodifier1 {
public static void main (String []args) {
	// default access modifier
	System.out.println("DEFAULT ACCESS MODIFIER");
	defaultacessmodifier obj = new defaultacessmodifier ();
	obj.display();
}
	
}