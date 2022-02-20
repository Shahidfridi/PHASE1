package SingleDimensionArray;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int [][] a={{3,4,5},
			   	{5,7,8}};
		for (int row =0;row<a.length; row++) {
			for (int col=0; col<a[row].length;col++) {
		
			System.out.println("array[row],[col]="+a[row][col]);
	}
		}
	}
}
