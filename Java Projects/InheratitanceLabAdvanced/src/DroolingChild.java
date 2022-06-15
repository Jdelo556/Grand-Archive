
// 3. Make DroolingChild extend from parent

class DroolingChild extends Parent {

  int droolAmount;

  // 4.  Create a constructor for DroolingChild which has name, energy and droolAmount as parameters. Then call the super constructor inside the body and pass in name and energy.  Finally assign the value of the parameter droolAmount to the droolAmount variable that belongs to the class.  Inside the constructor
public DroolingChild(String name , String energy , int droolAmount){  
  super(name , energy);
  this.droolAmount = droolAmount; 
   this.name = name;
	this.energy = energy;
  
}




  // Overridden method. Just like what happened in the Parent class.
  @Override
  public void walk(){
    System.out.println(name + " crawls forward with " + energy + " energy while drooling " + droolAmount + " liters");
  }

}