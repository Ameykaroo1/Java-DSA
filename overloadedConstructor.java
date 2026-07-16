public class overloadedConstructor {
    String username;
    String email;
    int age;
  
    overloadedConstructor(String username){
      this.username = username;
      this.email = "Not Provided";
      this.age = 0;
    }

    overloadedConstructor(String username,String email){
      this.username = username;
      this.email = email;
      this.age = 0;
    }

    overloadedConstructor(String username,String email,int age){
      this.username = username;
      this.email = email;
      this.age = age;
    }
} 

class Maine {
  public static void main(String[] args) {
    overloadedConstructor user1 = new overloadedConstructor("Amey");
    overloadedConstructor user2 = new overloadedConstructor("Amogh", "amogh@gamil.com");
    overloadedConstructor user3 = new overloadedConstructor("Margesh","margesh@gmail.com",20);

    System.out.println(user1.username);
    System.out.println(user1.email);
    System.out.println(user1.age);
    System.out.println(user2.username);
    System.out.println(user2.email);
    System.out.println(user2.age);
    System.out.println(user3.username);
    System.out.println(user3.email);
    System.out.println(user3.age);
  }
  
}