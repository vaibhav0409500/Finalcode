
public class ReverseString
{
    public static void main(String[] args)
    {
        String str = "4523";
        
        
        System.out.println(ReverseStringnew(str));
        
 
    }
    
    
    
    
    
    static String ReverseStringnew(String str)
    
    {
    	
    	   if(null== str || str.length()<=1)
    	   {   
		    return str;
    	   }
    	   
    	    return ReverseStringnew(str.substring(1))+ str.charAt(0);
    	
    }
    
    
}





