package constructor;

public class constructor {
	private String name;
	constructor( ){
		System.out.println(" constructor creation");
		name ="Hello world";
	}

	public static void main(String[] args) {
	constructor ooo = new constructor();
	System.out.println("constructor: "+ooo.name);

	}

}
