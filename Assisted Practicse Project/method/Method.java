package Method;

public class Method {
	int add =0;
	public int addTwoInt(int a, int b) {
		add = a+b;
		return add;
	}
}
class method1{
	public static void main (String[] args) {
		Method S= new Method();
		int A = S.addTwoInt(4,9);
		System.out.println("the sum of two no is :"+A);
	}
}
