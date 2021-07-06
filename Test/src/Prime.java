import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
    	
    	
    	Scanner s = new Scanner(System.in);  
        System.out.print("Enter a number : ");  
        int num = s.nextInt(); 
    	
      //  int num = 13;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println(num + " is not a prime number.");
        else
            System.out.println(num + " is  a prime number.");
    }
}