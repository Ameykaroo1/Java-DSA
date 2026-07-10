public class method_in {
  public static void main(String[] args) {

    String name= "Amey";
    int age =19;
    happyBirthday(name);
    System.out.println(square(10));

    if (ageCheck(age)){
      System.out.println("You can vote");
    }
    else{
      System.out.println("You can not vote.");
    }
  }
  static void happyBirthday(String name){
      System.out.println("Happy Birthday to you!");
      System.out.printf("Happy Birthday dear %s!", name);
    }

  static double square(double number){
    return number *number;
  }

  static boolean ageCheck(int age){
    if (age >=18){
      return true;
    }
    else{
      return false;
    }
  }
}