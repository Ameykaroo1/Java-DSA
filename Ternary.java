public class Ternary {
  public static void main(String[] args) {
    int score = 70;
    String pasOrFail = (score >=60)?"Pass":"Fail";
    System.out.println(pasOrFail);

    int number=3;
    String evenOdd =(number%2==0)?"Even":"Odd";
    System.out.println(evenOdd);

    int hours = 13;
    String timeOfDay = (hours >=12)?"PM":"AM";
    System.out.println(timeOfDay);

    int income = 60000;
    double taxRate= (income >=40000)?0.25:0.15;
    System.out.println(taxRate);
  }
}
