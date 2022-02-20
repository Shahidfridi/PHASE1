package Method;

public class Callmethod {
		int a =87;
		int operation (int a) {
			a=a*10/100;
			return (a);
		}
		public static void main (String[] args) {
			Callmethod C = new Callmethod();
			System.out.println("result :"+C.a);
			C.operation(70);
			System.out.println("result:"+C.a);
		}

	}


