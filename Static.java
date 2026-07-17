public class Static {
  String name;
  static int numOfFriends;
  Static(String name){
    this.name = name;
    numOfFriends++;
  }

  static void showFriends(){
    System.out.println("You have "+ numOfFriends+ " total friends.");
  }
}
class mains{
  public static void main(String[] args) {
    Static f1 = new Static("Amey");
    Static f2 = new Static("Patrick");
    Static f3 = new Static("Amogh");
    System.out.println(Static.numOfFriends);
    System.out.println(Static.numOfFriends);
    System.out.println(Static.numOfFriends);

    Static.showFriends();

  }
}
