import java.util.*;

public class Reverse_Array {
  public static void reverse(int num[]) {
    int start = 0;
    int end = num.length - 1;

    while (start < end) {
      int temp = num[start];   // save the left value
      num[start] = num[end];   // left gets the right value
      num[end] = temp;         // right gets the saved left value

      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num[] = new int[5];
    System.out.println("Enter numbers in Array:");
    for (int i = 0; i < num.length; i++) {
      num[i] = sc.nextInt();
    }

    reverse(num);

    System.out.println("Reversed array: " + Arrays.toString(num));
  }
}