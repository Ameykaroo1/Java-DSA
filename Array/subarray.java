import  java.util.*;
public class subarray {
  public static void printsubarrays(int arr[]){
    for(int i=0;i<arr.length;i++){
      int start = i;
      for(int j=i; j<arr.length;j++){
        int end =j;
        for(int k = start;k<=end;k++){
          System.out.print(arr[k]+" ");
        }
        System.out.println();
      }
      System.out .println();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    System.out.println("Enter number for array:");
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println();
    printsubarrays(arr);
  }
}
