import java.util.Scanner;
public class LinearSearch {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num[] = new int[10];
    System.out.println("Enter Number in Array");
    for(int i =0 ;i<num.length;i++){
      num[i]=sc.nextInt();
    }
    System.out.println("Enter Search key:");
    int sk = sc.nextInt();

    boolean found = false;
    for( int i =0 ;i<num.length;i++){
      if(num[i]== sk){
        System.out.println("Element found at index:" + i);
        found = true;
        break;
      }
    }
    if(!found){
      System.out.println("Number dose not exist");
    }
  }
}
