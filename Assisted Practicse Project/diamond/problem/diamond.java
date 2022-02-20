package diamond.problem;
interface diamondsize
{
	public default void display()
	{	
	
	System.out.println("Diamondsize");
	}
}
interface diamondshape
{
	public default void display()
	{	
	
	System.out.println("Diamondshape");
	}
}
public class diamond implements diamondsize,diamondshape{
public void display()
{
diamondsize.super.display();
diamondshape.super.display();
}
	public static void main(String[] args) {
		diamond obj= new diamond();
		obj.display();

	}

}
