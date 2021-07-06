
//abstract parent class
public abstract class Animal{
   //abstract method
   public abstract void sound();
}
//Dog class extends Animal class
 class Dog1 extends Animal{

   public void sound(){
	System.out.println("Woof");
   }
   public static void main(String args[]){
	Animal obj = new Dog1();
	obj.sound();
   }
}