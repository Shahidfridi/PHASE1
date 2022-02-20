package differentreturntype;

public class differentreturntype {
	int X1()
	  { 
	   System.out.println("X1 method"); 
	
	      return 10; 
	} 

	  float X2() 
	  { 
	    System.out.println("X2 method"); 
	      return 2.5f; 
	  } 
	  static char X3()
	  { 
	    System.out.println("X3 method"); 
	     return 'd'; 
	  }
	 	  
	public static void main(String[] args)
	 { 
	
		differentreturntype s = new differentreturntype();
	 

	      int a = s.X1(); 

	    System.out.println("Return value of X1()= " +a); 

	    float b = s.X2();
	    System.out.println("Return value of X2()= " +b); 


	    char ch = differentreturntype.X3(); 
	    System.out.println("Return value of X3()= " +ch); 
	  } 
	 }




