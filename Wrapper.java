public class Wrapper{
  public static void main(String[] args) {
    //Autoboxing
    Integer a = 123;
    Double b = 3.14;
    Character c = '@';
    Boolean d = true;
    String e =  "Pizza";

    //Unboxing
    int x =a;
    double y =b;
    char z = c;
    boolean w =d;


    String p = Integer.toString(123);
    String q = Double.toString(3.14);
    String r = Character.toString('@');
    String s = Boolean.toString(false);

    String t = p+q+r+s;
    System.out.println(t);


    int ab = Integer.parseInt("123");
    double cd= Double.parseDouble("3.14");
    char ef = "Pizza".charAt(0);
    boolean gh = Boolean.parseBoolean("True");

    System.out.println(ab);
    System.out.println(cd);
    System.out.println(ef);
    System.out.println(gh);


    char letter ='b';
    System.out.println(Character.isLetter(letter));
    System.out.println(Character.isUpperCase(letter));
    
  }
}