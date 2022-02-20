package accessmodifier;

public class Public {
	public void display() {
		System.out.println( "PUBLIC");
		
	}

}
class main{
	public static void main(String[] args) {
		Public a= new Public();
		a.display();
	}
}
