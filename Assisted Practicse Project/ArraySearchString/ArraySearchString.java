package ArraySearchString;

public class ArraySearchString {

	public static void main(String[] args) {
	String[] Strarr = {"chai","pani","cup","plate","suta"};
	boolean found = false;
	int D=0;
	String Str = "pani";
	int Size= Strarr.length;
	for (int i=0;i<Size;i++) {
		if (Str.equals(Strarr[i])) {
			D=i;
			found= true;
			break;
		}
	}
	
	if(found) {
		System.out.println("this elemrnt is found in the list"+D); 
	}
	else
		System.out.println("not found");

	}

}
