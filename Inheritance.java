public class Inheritance {
  boolean isAlive;
  Inheritance(){
    isAlive=true;
  }

  void eat(){
    System.out.println("The animal is eating.");
  }
}

class Cat extends Inheritance{
  int lives = 9;
  void speak(){
    System.out.println("The cat goes meow");
  }
}

class Dog extends Inheritance{
  int lives =1;
  void speak(){
    System.out.println("The dog goes woof");
  }
}

class maine{
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();

    System.out.println(dog.isAlive);
    System.out.println(cat.isAlive);
    dog.eat();
    cat.eat();

    System.out.println(dog.lives);
    System.out.println(cat.lives);

    dog.speak();
    cat.speak();
  }
}