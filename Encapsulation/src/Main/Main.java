package Main;
import java.util.Vector;

import models.Dog;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Vector<Dog> d = new Vector<Dog>();
		
		d.add(new Dog("Husky", 12));
		
		for(Dog dogs : d) {
			System.out.println(dogs.getName());
			System.out.println(dogs.getAge());
			
			dogs.setAge(dogs.getAge() - 1);
			System.out.println(dogs.getAge());
		}
		
		
	}

}
