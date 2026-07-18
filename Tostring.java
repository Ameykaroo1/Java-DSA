public class Tostring {
  
  String make;
  String model;
  int year;
  String color;

  Tostring(String make, String model, int year, String color){
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
  }

  @Override
  public String toString(){
    return this.color+" "+this.year+" "+this.make+" "+this.model;
  }
}

class Min{
  public static void main(String[] args) {
    Tostring car = new Tostring("Ford", "Mustang",2025, "Black");
    Tostring car1 = new Tostring("Chevrolet", "Corvette", 2026, "Red");
 
    System.out.println(car);
    System.out.println(car1);
  }
  
}
