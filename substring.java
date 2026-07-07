public class substring {
  public static void main(String[] args) {
    String email = "Bro123@gmail.com";
    String username = email.substring(0,6);
    String domain = email.substring(7,16);

    System.out.println(username);
    System.out.println(domain);

  }
}
