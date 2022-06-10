package Quesion_three;
 
public class WrapperClassConvert 
{
	public static void main(String[] args) 
	{		    
	    int a = 10;
	    System.out.print("After conversion : " );
	    convertToWrapper(a);
	}

	private static void convertToWrapper(int a) 
	{
	    Integer aObj = Integer.valueOf(a);

	    if(aObj instanceof Integer) 
	    {
	      System.out.println(aObj);
	    }
		
	}
}
