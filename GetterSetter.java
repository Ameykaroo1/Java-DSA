public class GetterSetter {

  private final String model;
  private String color;
  private int price;

  GetterSetter(String model, String color, int price){
    this.model = model;
    this.color = color;
    this.price = price;
  }

  String getModel(){
    return this.model;
  }

  String getColor(){
    return this.color;
  }

  String getPrice(){
    return "$" + this.price;
  }

  void setColor(String color){
    this.color = color;
  }

  void setPrice(int price){
    this.price = price;
  }
}

class Mmain{
  public static void main(String[] args){
    GetterSetter car = new GetterSetter("Charger", "Yellow", 100000);
    car.setColor("Black");
    car.setPrice(5000); 
    System.out.println(car.getColor()+ " "+car.getModel()+" "+ car.getPrice());
    //car.model = "Corvette";
  }
}