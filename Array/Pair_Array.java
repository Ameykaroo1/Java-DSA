import java.util.Scanner;
public class Pair_Array {
  public static  void printPairs(int arr[]){
    for(int i=0;i<arr.length;i++){
      int curr = arr[i];
      for(int j=i+1;j<arr.length;j++){
        System.out.print("("+ curr + ","+ arr[j] + ")");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number for Array:");
    int arr[] = new int[5];
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    printPairs(arr);
  }
}
