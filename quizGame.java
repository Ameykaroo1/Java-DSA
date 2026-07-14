import java.util.Scanner;

public class quizGame {
  public static void main(String[] args) {
    //JAVA QUIZ GAME
    // QUESTION array[]

    String[] questions = {"What is the main function of a router?",
    "Which part of the computer is considered the brain?",
    "What year was facebook launch?",
    "Who is know as father of computer?",
    "What was the first programming language?"};

    // OPTIONS array[][]
    String[][] options ={{"1. Storing files","2. Encrypting data","3. Directing internet traffic","4. Managing Password"},
    {"1. Mouse", "2. Keyboard" ,"3. CPU", "4. RAM"},
    {"1. 2000","2. 2004","3. 2007","4. 2008"},
    {"1. Steve Jobs", "2. Bill Gates","3. Alan Turing","4. Charles Babbage"},
    {"1. COBOL", "2. C","3. Fortran","4. Assembly"}};

  

    // DECLARE varibles

  int []answers ={3, 3, 2, 4, 3};
  int score = 0;
  int guess;

  Scanner scanner = new Scanner(System.in);
    // WELCOME message
    System.out.println("****************************************");
    System.out.println("Welcome to the JAVA Quiz Game.");
    System.out.println("****************************************");

    // QUESTION (loop)
    for(int i=0; i<questions.length ;i++){
      System.out.println(questions[i]);

      //Options
      for(String option : options[i]){
        System.out.println(option);
      }
      //  GET GUESS FROM USER
      System.out.print("Enter your guess: ");
      guess = scanner.nextInt();
      
    //  CHECK OUR GUESS
      if(guess == answers[i]){
        System.out.println("*********");
        System.out.println("CORRECT!");
        System.out.println("*********");
        score++;
      }
      else{
        System.out.println("*********");
        System.out.println("WRONG!");
        System.out.println("*********");
      }
    }
    // DISPLAY FINAL SCORE
    System.out.println("Your final score is: "+ score + " out of " + questions.length);

    scanner.close();
  }
}
