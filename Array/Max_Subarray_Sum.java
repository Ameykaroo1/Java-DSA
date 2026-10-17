import  java.util.*;
public class Max_Subarray_Sum {
  public static void maxsumsubarrays(int arr[]){
    
    int max_sum = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      int start = i;
      for(int j=i; j<arr.length;j++){
        int end =j;
        int curr=0;
        for(int k = start;k<=end;k++){
          curr += arr[k];
        }
        if(curr >max_sum){
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
