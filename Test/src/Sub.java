
public class Sub  extends Super {

	
	void Sample() {
	      System.out.println("method of sub class");
	   }
	   
	   public static void main(String args[]) {
	      Super obj = (Super)new Sub(); // upcasting
	      
	      Sub sub = (Sub) obj;//downcasting
	      obj.Sample();
	   }

}
