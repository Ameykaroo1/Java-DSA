import java.util.Scanner;
public class area_of_rectangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.print("Enter Length of Rectangle:");
    int length = scanner.nextInt();

    System.out.print("Enter Bredth of Rectangle");
    int bredth = scanner.nextInt();

    int area = length * bredth;
    System.out.println("The Area of Rectangle is : "+ area);

    scanner.close();
  }
}
