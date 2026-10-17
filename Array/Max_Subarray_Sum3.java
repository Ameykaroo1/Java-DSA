import  java.util.*;
public class Max_Subarray_Sum3 {
  public static void kadanes(int arr[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;

    for(int i=0; i<arr.length;i++){
      cs = Math.max(arr[i],cs + arr[i]);
      ms = Math.max(cs,ms);
    }
    System.out.println("Max Subarray sum is:"+ ms);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    System.out.println("Enter number for array:");
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println();
    kadanes(arr);
  }
}
