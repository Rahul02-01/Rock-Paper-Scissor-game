import java.util.*;

public class Rock_Paper_Scissor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n = 1;
        int count = 0;
        int count1 = 0;
        System.out.println("\nThe game has 3 rounds");
            try {
                while (n <= 3) {
                    System.out.println("\n1.Rock\n2.Scissor\n3.Paper");
                    System.out.print("Enter choice=");
                    int a = sc.nextInt();
                    int b = rand.nextInt(3);
                    while (b == 0) {
                        b = rand.nextInt(3);
                    }
                    if (a < 4) {
                        System.out.println("Your choice is: " + a);
                        System.out.println("Computer's choice is: " + b);
                        if (a == b) {
                            System.out.println("...It's a tie...");
                        } else if ((a == 1 && b == 2) || (a == 2 && b == 3) || (a == 3 && b == 1)) {
                            System.out.println("...Congrats you won the round...");
                            count++;
                        } else {
                            System.out.println("...Sorry you lost the round...");
                            count1++;
                        }
                        n++;
                    }
                    else if(a>3){
                        System.out.println("Enter correct choice to play the game..");
                    }
                }
                System.out.println("The final score is:");
                System.out.println("Your score= "+ count);
                System.out.println("Computer's score= "+ count1);
                if (count > count1){
                    System.out.println("\n...You Won the match...");
                }
                else if(count == count1){
                    System.out.println("\n...The game is tied...");
                }
                else{
                    System.out.println("\n...Better luck next time...");
                }
            }
            catch (Exception e) {
                System.out.println("The game cannot go further because:");
                System.out.println(e);
            }

    }

}
