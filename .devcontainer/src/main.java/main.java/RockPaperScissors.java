import java.util.Scanner;
 
public class RockPaperScissors
{
    public static double halves(int min, int max)
    {
        return ((int) (Math.random() * (max - min) + min) + 0.5);
    }

    public static int nonInclusive(int min, int max)
    {
        return ((int) (Math.random() * (max - min) + min + 0.5));
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String choice = "";
        int choiceNum;
        String cpuChoice = "";
        int min;
        int max;
        int randomNumber;

        while (true){
            System.out.println("\nRock, paper, or scissors?");
            choice = scan.next().toLowerCase();
            while (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors"))
            {
                System.out.println("Rock, paper, or scissors?");
                choice = scan.next().toLowerCase();
            }

            min = 1;
            max = 3;
            randomNumber = (int) (Math.random() * (max - min + 1) + min);
            //int nonInclusive = nonInclusive(min, max);
            //double halves = halves(min, max);
            if (randomNumber == 1){
                cpuChoice = "rock";
            }
            else{
                if (randomNumber == 2){
                    cpuChoice = "paper";
                }
                else{
                    cpuChoice = "scissors";
                }
            }

            System.out.println("The computer chose " + cpuChoice);
            
            if (choice.equals("rock")){
                choiceNum = 1;
            } else if (choice.equals("paper")){
                choiceNum = 2;
            } else{
                choiceNum = 3;
            }

            if (choiceNum == randomNumber){
                System.out.println("It's a tie!");
            } else if (choiceNum + 1 == randomNumber || choiceNum - 2 == randomNumber){
                System.out.println("You lose!");
            } else if (randomNumber + 1 == choiceNum || randomNumber - 2 == choiceNum){
                System.out.println("You win!");
            }
            //System.out.println(randomNumber + " " + nonInclusive + " " + halves);
        }   
    }
}
