// 1. Make Parent extend Grandparent.

class Parent extends Grandparent {

  
  String energy;


  // 2. Create a constructor for Parent which takes in name and energy then calls super constructor and passes in the name value.  Remember to assign the parameter energy to the class variable energy as well.
public Parent(String name , String energy){
    super(name); 
    this.energy = energy;
    this.name = name;
  }



  // This is a overridden method. Originally from grandparent.
  @Override
  public void walk(){
    System.out.println(name + " walks normally with " + energy + " energy");
  }

}