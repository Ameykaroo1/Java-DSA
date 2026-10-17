import java.util.*;
public class TryCatch {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    try {
      System.out.println("Enter a number: ");
      int num = scanner.nextInt();
      System.out.println(num);
    }
    catch (ArithmeticException e){
      System.out.println("You cannot divide by zero");
    }
    catch (InputMismatchException e){
      System.out.println("You must enter a number");
    }
    catch (Exception e){
      System.out.println("Something went wrong");
    }
    finally {
      scanner.close();
      System.out.println("Scanner closed");
    }
  }
}
 