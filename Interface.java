public class Interface {

}
interface Prey{
  void flee();
}
interface Predator{
  void hunt();
}
class Rabbit implements Prey{
  @Override
  public void flee(){
    System.out.println("The rabbit is running away.");
  }
}
class Fishs implements Prey, Predator{
  @Override
  public void hunt(){
    System.out.println("The fish is hunting.");
  }

  @Override
  public void flee(){
    System.out.println("This is swimming away.");
  }

}
class Hauk implements Predator{
  @Override
  public void hunt(){
    System.out.println("Hauk is hunting.");
  }
}
class Maies{
  public static void main(String[] args) {  
    Rabbit rabbit = new Rabbit();
    rabbit.flee();
    Hauk hauk = new Hauk();
    hauk.hunt();
    Fishs fish = new Fishs();
    fish.flee();
    fish.hunt();
  }
}