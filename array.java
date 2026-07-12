import java.util.Arrays;
public class array {
  public static void main(String[] args) {
    String[] fruits = {"apple","orange","banana","coconut"};
    // fruits [0] = "Pineapple";
    //  int numOfFruits = fruits.length;
    // System.out.println(numOfFruits);
    Arrays.sort(fruits);
    Arrays.fill(fruits, "pineapple");

    // for(int i =0; i<fruits.length; i++){
    //   System.out.println(fruits[i]);
    // }

    for (String fruit : fruits){
      System.out.println(fruit);
    }
  }
}
