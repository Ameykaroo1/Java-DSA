public class ArrayOfObject {
  String model;
  String color;

  ArrayOfObject(String model, String color){
    this.model = model;
    this.color = color;
  }

  void drive(){
    System.out.println("You drive the" + this.color + " "+this.model);
  }
}

class InnerArrayOfObject {
  public static void main(String[] args) {
    ArrayOfObject car1 = new ArrayOfObject("Mustang", "Red");
    ArrayOfObject car2 = new ArrayOfObject("Corvette", "Blue");
    ArrayOfObject car3 = new ArrayOfObject("Charger", "Yellow");

    ArrayOfObject[] cars = {car1, car2, car3};
    for(int i = 0;i <cars.length ;i++){
      cars[i].drive();
    }
  }


  
}
