
public class Main {
	public static void train(Animal animal){
	    animal.print();
	  }

	  public static void train2(Animal animal){

	    if (animal instanceof Dog){
	      Dog dog = (Dog) animal;
	      System.out.println(dog.name + "'s color is " + dog.color);
	    }
	    else if (animal instanceof Rabbit){
	      Rabbit rabbit = (Rabbit) animal;
	      System.out.println(rabbit.name + "'s speed is " + rabbit.speed);
	    }
	    else if (animal instanceof Cat){
	      Cat cat = (Cat) animal;
	      System.out.println(cat.name + "'s jump height is " + cat.jump);
	    }
	  }

	  public static void main(String[] args) {

	    Dog dog = new Dog();
	    Cat cat = new Cat();
	    Rabbit rabbit = new Rabbit();

	    // Upcasting
	    // This is upcasting since train only takes in Animal objects. It can still take a dog object because of upcasting.

	    train(dog);
	    train(cat);
	    train(rabbit);

	    // 1) Create a Rabbit and Cat classes. Make sure to add a print() method to them like the Dog class has. 
	    // 2) Make rabbit and cat objects. 
	     


	    // Downcasting
	    dog.name = "Rex";
	    dog.color = "brown";
	    train2(dog);
	    
	    rabbit.name = "Floof";
	    rabbit.speed = 15;
	    train2(rabbit);
	    
	    cat.name = "Tom";
	    cat.jump = 8;
	    train2(cat);

	    // 3) Call the train method with the new rabbit and cat objects.
	    // 4) Add a speed integer variable to the Rabbit class.
	    // 5) Set the rabbits name to Floof (like what is happening above to the dog) and its speed to 15.

}
}
