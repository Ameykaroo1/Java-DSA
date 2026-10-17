import java.util.*;
public class Create_Array {
  public static void main (String [] args){
    int marks[] = new int[50];
    int numbers[] = {1,2,3};
    String fruits [] = {"apple","mango","orange"};

    Scanner sc = new Scanner(System.in);
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();

    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);

    marks[2]= 99;
    System.out.println(marks[2]);

    int percentage = (marks[0] + marks[1] + marks[2])/3;
    System.out.println("percentage =" + percentage+ "%");
    System.out.println(marks.length);
  }
}