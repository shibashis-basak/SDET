package javaactivity8;

public class Activity2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
			Activity2_4 act1 = new Activity2_4 ();
            act1.exceptionTest("Will print to console");
            Activity2_4 act2 = new Activity2_4 ();
            act2.exceptionTest(null);
            Activity2_4 act3 = new Activity2_4 ();
            act3.exceptionTest("Won't execute");
            
        } 
		catch(CustomException e1) 
		{
            System.out.println("Inside catch block: " + e1.getMessage());
        }
	}
		
	public void exceptionTest(String str) throws CustomException 
	{
	    if(str == null) 
	    {
	    	throw new CustomException("String value is null");
	    } 
	    else 
	    {
	        System.out.println(str);
	    }
	}
}
