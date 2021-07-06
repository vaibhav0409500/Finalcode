
public class Extractnumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "abc d 1234567890pqr 54897";
		    StringBuilder myNumbers = new StringBuilder();
		    for (int i = 0; i < str.length(); i++) {
		        if (Character.isDigit(str.charAt(i))) {
		            myNumbers.append(str.charAt(i));
		            System.out.println(str.charAt(i) + " is a digit.");
		        } else {
		            System.out.println(str.charAt(i) + " not a digit.");
		        }
		    }
		    System.out.println("Your numbers: " + myNumbers.toString());
		
		
		
		
		
		

	}

}
