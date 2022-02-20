package Method;

public class Overload {
	public int add(int x, int y) {
		return (x+y);
	}
public double add (double a,double b){
	return (a+b);
}
	public static void main(String[] args) {
		Overload A= new Overload();
		System.out.println(A.add(45, 80));
		System.out.println(A.add(78, 50));
	
	}

}
