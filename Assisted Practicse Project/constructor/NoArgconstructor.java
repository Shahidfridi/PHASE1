package constructor;

public class NoArgconstructor {
	int a;
	private NoArgconstructor() {
		a= 15;
		System.out.println(" constructor:");
	}

	public static void main(String[] args) {
		
		NoArgconstructor occ= new NoArgconstructor();
		System.out.println("a:"+occ.a);
	}

}
