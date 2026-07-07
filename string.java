public class string {
  public static void main(String[] args) {
    String name = "   Bro Code    ";
    int length = name.length();
    char letter = name.charAt(0);
    int index = name.indexOf("r");
    int lastIndex = name.lastIndexOf("o");
    
    name = name.toLowerCase();
    name = name.toLowerCase();
    name = name.trim();
    name= name.replace("o", "a");
    System.out.println(length);
    System.out.println(letter);
    System.out.println(index);
    System.out.println(lastIndex);
    System.out.println(name);
    System.out.println(name.isEmpty());
  }
}
