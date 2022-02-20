package constructor;

public class parametarisedconstructor {
	String name;
	parametarisedconstructor(String S){
		name =  S; 
		System.out.println("Hello Shark Tank India: "+S);
	}

	public static void main(String[] args) {
		
		parametarisedconstructor obj = new parametarisedconstructor("Bussiness startup");

	}

}
