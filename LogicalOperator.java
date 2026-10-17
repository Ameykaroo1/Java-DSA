import java.util.*;
public class LogicalOperator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Temperature: ");
    double temp =scanner.nextDouble();

    System.out.print("Is it Sunny? :");
    boolean isSunny =scanner.nextBoolean();

    if(temp <=30 && temp>=0 && isSunny){
      System.out.println("The weather is GOOD.");
      System.out.println("It is SUNNY outside.");
    }
    else if(temp <=30 && temp >=0 && !isSunny){
      System.out.println("The weather is GOOD.");
      System.out.println("It is CLOUDY outside.");
    }
    else if(temp >30 || temp<0){
      System.out.println("The weather is bad.");
    }
    scanner.close();
  }
}
