/*import Dog.Dog;
import Dog.Puppy;*/
import Dog.*;

public class Main {
	public static void main(String []agrs){
		System.out.println("hello world.")	;
		Dog dog = new Dog();
		System.out.println(dog.Description());
		Puppy puppy = new Puppy();
		System.out.println(puppy.Description());
		if(puppy instanceof Dog) {
			System.out.println("puppy is a instanceof Dog.");
		}

		try {
			System.out.println("no exception: " + 1/0);	
		} catch (Exception e) {
			System.out.println("exception: " + e);	
		}
		
		Dog.PrintMsg();
		dog.PrintMsg();
	}
}