package InnerClass;

public class InnerClass {
	private String name ="HELLO SHARK TANK INDIA";
	class IC{
		void InnerClass()
		{
			System.out.println(name+"InnerClass");}
		}

	public static void main(String[] args) {
		InnerClass obj= new InnerClass();
		InnerClass.IC  C= obj.new IC();
		C.InnerClass();

	}

}
