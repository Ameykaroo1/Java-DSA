import java.util.*;
public class if_else {
  public static void main(String[] args) {

    String name;
    int age;
    Scanner scanner =new Scanner (System.in);
    System.out.print("Enter your name: ");
    name = scanner.nextLine();
    System.out.print("Enter your age: ");
    age =scanner.nextInt() ;


    if(name.isEmpty()){
      System.out.println("You didn't enter your name!");
    }
    else{
      System.out.println("Hello "+name+ " !");
    }

    if(age >=18){
      System.out.println("You are an adult!");
    }
    else if(age<0){
      System.out.println("You haven't been born yet!");
    }
    else{
      System.out.println("You are child!");
    }
  }
  
}
