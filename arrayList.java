import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class arrayList{
  public static void main(String[] args) {
    // ArrayList<Integer> list = new ArrayList<>();
    // ArrayList<Double> doubleList = new ArrayList<>();
    // ArrayList<String> Fruits = new ArrayList<>();
    // list.add(3);
    // list.add(5);
    // list.add(7);

    // doubleList.add(1.1);
    // doubleList.add(2.2);
    // doubleList.add(3.3);

    // Fruits.add("Apple");
    // Fruits.add("Banana");
    // Fruits.add("Cherry");

    // Fruits.remove("Banana");
    // Fruits.set(1, "Mango");

    // System.out.println("ArrayList: " + list);
    // System.out.println("Double ArrayList: " + doubleList);
    // System.out.println("Fruits ArrayList: " + Fruits);
    // System.out.println(Fruits.get(0));
    // System.out.println(Fruits.size());

    // Collections.sort(Fruits);
    // System.out.println("Sorted Fruits ArrayList: " + Fruits);

    // for(String fruit :Fruits){
    //   System.out.println(fruit);
    // }

    Scanner sc = new Scanner(System.in);
    ArrayList<String> fruits = new ArrayList<>();
    System.out.println("Enter the number of fruits you want to add:");
    int n = sc.nextInt();
    sc.nextLine(); // Consume the newline character
    for (int i = 0; i < n; i++) {
      System.out.println("Enter fruit " + (i + 1) + ":");
      String fruit = sc.nextLine();
      fruits.add(fruit);
    }
    System.out.println("Fruits ArrayList: " + fruits);

    sc.close();
  }
}