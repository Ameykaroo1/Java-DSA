import java.util.*;
public class compond_intrest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double principal;
    double rate;
    int  timesCompounded;
    double ammount;
    int years;

    System.out.print("Enter principal: ");
    principal = scanner.nextDouble();
    System.out.print("Enter Rate: ");
    rate = scanner.nextDouble()/100;
    System.out.print("Enter Times Compounded: ");
    timesCompounded = scanner.nextInt();
    System.out.print("Enter years: ");
    years = scanner.nextInt();

    ammount = principal * Math.pow(1+ (rate / timesCompounded),timesCompounded*years);

    System.out.printf("Amount is: %f",ammount);

  }
}
