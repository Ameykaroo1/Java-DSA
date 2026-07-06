import java.util.Random;
public class random_number {
  public static void main(String[] args) {
    Random random = new Random();
    int number;
    number = random.nextInt(1,6);
    System.out.println(number);
  }
}
