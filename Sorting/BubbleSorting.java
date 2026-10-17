package Sorting;
import  java.util.*;;
public class BubbleSorting {
  public static void bubbleSort(int arr[]){
    for(int turns=0; turns<arr.length-1;turns++){
      for(int j=0; j<arr.length-1-turns;j++){
        if(arr[j] >arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }

  public static void printArr(int arr[]){
    for(int i=0;i <arr.length;i++){
      System.out.println(arr[i] +" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr [] = new int[5];
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    bubbleSort(arr);
    printArr(arr);
 }
}
