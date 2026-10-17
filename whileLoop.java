import java.util.*;
public class whileLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name = "";
    while (name.isEmpty()){
      System.out.print("Enter your name: ");
      name = scanner.nextLine();
    }

    String response="";
    while(!response.equals("Q")){
      System.out.println("You are playing a game: ");
      System.out.print("Press Q to quit: ");
      response=scanner.next().toUpperCase();
    }
    System.out.print("You have quit the game.");


    int age = 0;
    do{
      System.out.println("Your age can't be negative");
      System.out.print("Enter your age: ");
      age = scanner.nextInt();
    }while(age<0);
    scanner.close();
  }
}