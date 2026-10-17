public class Composition{
  String model;
  int year;
  Engine engine;

  Composition(String model, int year,String engineType){
    this.model = model;
    this.year = year;
    this.engine = new Engine(engineType);
  }

  void start(){
    this.engine.start();
    System.out.println("The "+ this.model+"running");
  }
}
class Engine{
  String type;
  Engine(String type){
    this.type =type;
  }

  void start(){
    System.out.println("You start the " + this.type);
  }
}

class Mainns{
  public static void main(String[] args) {
    Composition car = new Composition("Corvette", 2025, "V8");
    System.out.println(car.model);
    System.out.println(car.year);
    System.out.println(car.engine.type);

    car.start();
  }
}