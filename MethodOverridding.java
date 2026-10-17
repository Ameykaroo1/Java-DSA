public class MethodOverridding{
  void move(){
    System.out.println("This animal is Running");
  }

}
class Dogs extends MethodOverridding{

  
}
class Cats extends MethodOverridding{

}
class Fish extends MethodOverridding{
  @Override
  void move(){
    System.out.println("This animal is swimming");
  }
}
class Mainses{
  public static void main(String[] args) {
    Dogs dogs = new Dogs();
    Cats cats = new Cats();
    Fish fish = new Fish();
    dogs.move();
    cats.move();
    fish.move();
  }
}