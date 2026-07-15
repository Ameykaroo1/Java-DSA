public class Car{
    String make = "Porshe";
    String model = "911 Carrera s";
    int year = 2024;
    double price = 30000000;
    boolean isRunning = true;
}

class Main{
  public static void main(String[] args) {
    Car car = new Car();
    System.out.println(car.model);
  }
}