import java.util.Scanner;
public class user_input {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // System.out.print("Enter your name:");
    // String name = scanner.nextLine();

    // System.out.print("Enter your age");
    // int age = scanner.nextInt();

    // System.out.println("What is your gpa");
    // double gpa = scanner.nextDouble();

    // System.out.println("Are you Student");
    // boolean isStudent = scanner.nextBoolean();
    
    // System.out.println("Hello "+ name);
    // System.out.println("You are "+age+" year old");
    // System.out.println("Your gpa is :"+gpa);
    // System.out.println("Student: "+isStudent);



    //common issue
    System.out.print("Enter your age: ");
    int aged = scanner.nextInt();
    scanner.nextLine();
    
    System.out.print("Enter your favorite color: ");
    String color = scanner.nextLine();

    System.out.println("You are "+aged +" year old");
    System.out.println("You like the color " + color);
    scanner.close();
  }
}
