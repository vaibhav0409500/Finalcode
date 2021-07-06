import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
    	
    	int no ,fect=1;
    	
    	Scanner s = new Scanner(System.in);  
        System.out.print("Enter a number : ");  
         no = s.nextInt(); 
    	
      //  int num = 13;
       
        for(int i = 1; i<=no; i++)
        {
           fect=fect*i;
        }
        
        System.out.print("factorial is "+fect);  
    }




	}


