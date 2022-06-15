
import java.util.*;

class Maiin {
  public static void main(String[] args) {

  // 5. Create an arraylist called family that can accommodate grandparents, parents and children.
 ArrayList<Grandparent> family  = new ArrayList<>();
    
    
  // 6. Create two grandparents, two parents, one child, and one droolingchild such that the final output in the loop at the bottom of the main outputs the following:
  
    Grandparent Mary = new Grandparent("Mary"); 
    
    Grandparent John = new Grandparent("John");
      
    
    Parent Amy = new  Parent("Amy" , "medium");
      
    Parent Andy = new Parent("Andy" , "low");
      
    
    Children Annie = new Children("Annie" , "high" , "johnson" );
    
    DroolingChild Tibbers = new DroolingChild("Tibbers" , "high"  , 10);
    
 
    // Mary staggers along
    // John staggers along
    // Amy walks normally with medium energy
    // Andy walks normally with low energy
    // Annie crawls forward with high energy while wearing johnson diapers
    // Tibbers crawls forward with high energy while drooling 10 liters


    // 7. Add all these new family members to the family.
    family.add(Mary);
    family.add(John);
    family.add(Amy);
    family.add(Andy);
    family.add(Annie);
    family.add(Tibbers);

    // This should go through the family and call their walk() methods. (It will work if the code is done correctly DO NOT CHANGE THIS)
    for (Grandparent p : family){
      p.walk();
    }


  }
}