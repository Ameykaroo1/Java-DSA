public class varible_Scope {
  static int x=3; //Class scope
  public static void main(String[] args) {
    // int x =1; //Local
    
    doSomething();
  }
  static void doSomething(){
    // int x=2;  //Local 
    System.out.println(x);
  }
}
