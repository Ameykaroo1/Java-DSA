import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
  public static void main(String[] args) {
    //Java SLOT MACHINE
    //DECLARE Varibles
    Scanner scanner = new Scanner(System.in);
    int balance =100;
    int bet;
    int payout;
    String[] row;
    String playAgain;

    //Display welcome message
    System.out.println("************************");
    System.out.println(" Welcome to Java Slot");
    System.out.println("Symbols: 😀 😁 😂 😎 🚗 🍔");
    System.out.println("************************");

    //Play if balance 
    while(balance >0){
      System.out.println("Current balance: $"+ balance);
      System.out.println("Place your bet amount: ");
      bet = scanner.nextInt();
      scanner.nextLine();

      if(bet > balance){
        System.out.println("INSUFFICIENT FUNDS");
        continue;
      }
      else if(bet<=0){
        System.out.println("Bet must be greater than 0 ");
        continue;
      }
      else{
        balance -= bet;
      }
      System.out.println("Spinning....");
      row = spinRow();
      printRow(row);

      
    //get payout
      payout = getPayout(row ,bet);
      if(payout > 0){
        System.out.println("You won $" + payout);
        balance += payout;
      }
      else{
        System.out.println("Sorry you loss the payout");
      }
      
    //ask to play again
      System.out.print("Do you want to play again?");
      playAgain = scanner.nextLine().toUpperCase();

      if(!playAgain.equals("Y")){
        break;
      }
      
      System.out.println("GAME OVER ! your final balance is $"+balance);

      scanner.close();
    }
    //Enter bet ammount
    //verify if bet > balance
    //verify if bet>0
    //subtract bet from balance
    //spin row
    // print row
    //display exit message
  }
  static String[] spinRow(){

    String[] symbols ={"😀", "😁", "😂", "🚗", "🍔"};
    String[] row = new String[3];
    Random random = new Random();

    for(int i=0;i<3;i++){
      row[i] = symbols[random.nextInt(symbols.length)];
    }
    

    return new String[0];
  }
  static void printRow(String[] row){
    System.out.println("**************");
    System.out.println(" "+ String.join(" | ",row));
    System.out.println("**************");
  }

  static int getPayout(String[] row, int bet){

    if(row[0].equals(row[1]) && row[1].equals(row[2])){
      return switch(row[0]){
        case "😀" -> bet *3;
        case "😁" -> bet *4;
        case "😂" -> bet *5;
        case "🚗" -> bet *10;
        case "🍔" -> bet *20;
        default -> 0;
      };
    }

    else if(row[0].equals(row[1])){
      return switch(row[0]){
        case "😀" -> bet *2;
        case "😁" -> bet *3;
        case "😂" -> bet *4;
        case "🚗" -> bet *5;
        case "🍔" -> bet *10;
        default -> 0;
      };
    }

    else if(row[1].equals(row[2])){
      return switch(row[1]){
        case "😀" -> bet *2;
        case "😁" -> bet *3;
        case "😂" -> bet *4;
        case "🚗" -> bet *5;
        case "🍔" -> bet *10;
        default -> 0;
      };
    }

    return 0;
  }
}
