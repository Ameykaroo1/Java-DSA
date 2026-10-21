package String;

public class palindrome {
  public static void main(String[] args) {
    String l1 = "racecar";
    boolean flag=false;
    for(int i=0;i<l1.length()/2;i++){
      if(l1.charAt(i) == l1.charAt(l1.length()-i-1)){
        flag=true;
      }
      else{
        flag=false;
      }
    }
    if(flag=true){
      System.out.println("String is palindrome");
    }
    else{
      System.out.println("String is not Palindrome");
    }
  }
}
