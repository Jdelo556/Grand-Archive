public class Children extends Parent {

  String diaperBrand;

  public Children(String name, String energy, String diaperBrand){
    super(name , energy);
    this.diaperBrand = diaperBrand;
    this.name = name;
    this.energy = energy;
  }

  
  public void walk(){
    System.out.println(name + " crawls forward with " + energy + " energy while wearing " + diaperBrand + " diapers");
  }

}