
public class Cat {
	 
	//Instance variable
		 private String name;
		 private String breed;

	 //Invoking current class Constructor
	public Cat() {
		  this("Marshmellow","Turkish Angora");
		  System.out.println("Default Constructor");
		 }

	public Cat(String name, String breed) {
		  this.name = name;
		  this.breed = breed;
		  System.out.println("Parameterized constructor");
		 }

		 public static void main(String args[]) {
		  Cat siamese = new Cat();
		 }
		}

