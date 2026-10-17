import  java.util.*;
public class Max_Subarray_Sum1 {
  public static void maxsumsubarrays(int arr[]){
    
    int max_sum = Integer.MIN_VALUE;
    int prefix [] = new int [arr.length];

    prefix[0] = arr[0];
    for(int i=1; i<prefix.length;i++){
      prefix[i] = prefix[i-1] + arr[i];
    }
    for(int i=0;i<arr.length;i++){
      int start = i;
      for(int j=i; j<arr.length;j++){
        int end =j;
        int curr= start == 0 ? prefix[end]: prefix[end] - prefix[start-1];
        if (curr > max_sum) {
          max_sum = curr;
        } 
        System.out.println(curr);
      }
    }
    System.out.println("Max Sum:"+ max_sum);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    System.out.println("Enter number for array:");
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println();
    maxsumsubarrays(arr);
  }
}
