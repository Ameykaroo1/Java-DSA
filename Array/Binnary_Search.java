import java.util.*;
public class Binnary_Search {
  public static int binnary( int num[], int key){
    int low= 0;
    int high=num.length-1;
   

    while(low <= high){
      int mid = low+(high-low)/2;
      if(key == num[mid]){
        return mid;
      }
      else if(num[mid] < key){
        low = mid+1;
      }
      else {
        high = mid-1;
      }
    }
    return  -1;
  }
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int num[]= new int[10];
    System.out.print("Enter Number in sorted manner for Array:");
    for(int i=0;i<num.length;i++){
      num[i]= sc.nextInt();
    }
    System.out.println("Enter Search key:");
    int key = sc.nextInt();
    int ans = binnary(num,key);
    if( ans == -1){
      System.out.println("Element dose not exist");
    }
    else{
      System.out.println("Key found at index: " + ans);
    }
  }
}
