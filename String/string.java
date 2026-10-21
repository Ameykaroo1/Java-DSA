package String;

import java.util.Scanner;

public class string {
  public static  void printLetters(string str){
    for(int i=0; i<str.length(); i++){
      System.out.println(str.charAt(i) + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    char arr [] = {'a','b','c','d'};
    String str = "abcd";
    String str2 = new String("xyz");

    //String are IMMUTABLE

    // Scanner sc = new  Scanner(System.in);
    // String name;
    // name = sc.nextLine();
    // System.out.println(name);

    System.out.println(str.length());

    //concatenation
    String firstName = "Shradha";
    String lastName = "Khapra";
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);

    //ChartAt
    System.out.println(fullName.charAt(0));
    printLetters(fullName);
  }
}
