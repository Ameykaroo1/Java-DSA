public class Car{
    String make = "Porshe";
    String model = "911 Carrera s";
    int year = 2024;
    double price = 30000000;
    boolean isRunning = true;

    void start(){
      System.out.println("You start the engine");
    }
    void stop(){
      System.out.println("You stop the engine");
    }
}

class Main{
  public static void main(String[] args) {
    Car car1 = new Car();
    car1.isRunning = false;
    System.out.println(car1.make+ " "+car1.model);
    System.out.println(car1.make);
    System.out.println(car1.model);
    System.out.println(car1.year);
    System.out.println(car1.price);
    System.out.println(car1.isRunning);
    car1.start();


    Car car2 = new Car();
    System.out.println(car2.make+ " "+car2.model);
  }
}