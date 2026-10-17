import java.util.*;
public class Enhanced_Switch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the day of the week: ");
    String day = scanner.nextLine().toLowerCase();
    switch ((day)) {
      case "monday" -> System.out.println("It is a weekday");
      case "tuesday" -> System.out.println("It is a Weekday");
      case "wednesday" -> System.out.println("It is a Weekday");
      case "thursday" -> System.out.println("It is a Weekday");
      case "friday" -> System.out.println("It is a Weekday");
      case "saturday" -> System.out.println("It is a Weekend");
      case "sunday" -> System.out.println("It is a Weekend");
      default -> System.out.println(day +" is not a day");

    }
  }
}
