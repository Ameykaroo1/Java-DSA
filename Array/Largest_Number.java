import java.util.Scanner;
public class Largest_Number{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num[] = new int[5];
    System.out.println("Enter Number in Array");
    for(int i =0 ;i<num.length;i++){
      num[i]=sc.nextInt();
    }
    int inf = Integer.MIN_VALUE;
    for(int i=0;i<num.length;i++){
      if(num[i]>inf){
        inf = num[i];
      }
      else{
        inf = inf;
      }
    }
    System.out.println("Largest Number is: "+ inf);
  }
}
