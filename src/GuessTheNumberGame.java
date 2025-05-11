import java.util.*;

class GuessTheNum{
      int randomNum;
      int guessNum;
      int tempScore;
      int score; ;

    public  void setScore(int yourScore){
        score =yourScore+1;
        }
    public int getScore(){
          return score;
      }
    public GuessTheNum(){
         randomNum = (int)(Math.random() * 10);  // 0 to 100
    }
    public void takeUserInput(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Guess the number");
         guessNum= scanner.nextInt();
         if(randomNum!=guessNum){
             if (guessNum > randomNum) {
                 System.out.println("you number is larger then the random number");
             }else {
                 System.out.println("you number is smaller then the random number");
             }
             do {
                 setScore(score++);
                 tempScore++;
                 takeUserInput();
             }
             while (guessNum!=randomNum);
         }
      }
    public void isCorrectNum(){
        setScore(tempScore);
        if(randomNum==guessNum){
            System.out.println("Congratulation your num in correct ");
            System.out.println("YOUR SCORE IS "+getScore());
        }
    }
}


public class GuessTheNumberGame {
    public static void main(String[] args) {
        GuessTheNum guessTheNum = new GuessTheNum();
      //  System.out.println(guessTheNum.randomNum);
        guessTheNum.takeUserInput();
        guessTheNum.isCorrectNum();

}
}
