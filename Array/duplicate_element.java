//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
import java.util.*;;
public class duplicate_element {
  public static  int duplicate_Element(int arr[]){
    Arrays.sort(arr);
    for(int i=1;i<arr.length;i++){
      if(arr[i] == arr[i-1]){
        return 1; 
      }
    }
    return 0;
  }
  public static void main(String[] args) {
    Scanner sc = new  Scanner(System.in);
    int arr[] = new int [4];
    System.out.println("Enter Number for Array:");
    for(int i=0;i< arr.length;i++){
      arr[i] = sc.nextInt();
    }
    int result = duplicate_Element(arr);
    if(result == 1){
      System.out.println("True");
    }
    else{
      System.out.println("False");
    }
  }
}
