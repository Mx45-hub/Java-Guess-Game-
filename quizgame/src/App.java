import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Lets play a guess game you only have 5 tries! You lose you out!  " );


        int num = (int)(Math.random() * 101);

        System.out.println("number is  " + num);

        int score = 5;


        for (int i = 0; i < 5; i++){

        Scanner mynum = new Scanner(System.in);
        System.out.println("Please enter number");


        int choosenum = mynum.nextInt();
        System.out.println("your number is " + mynum);


        if (choosenum < num) {
            System.out.println("Go Higher");
            score --;
            System.out.println("Chances left " + score);
        } else if (choosenum > num) {
             System.out.println("Go Lower My Friend!");

             System.out.println("Chances left " + score);
        } else if (choosenum == num) {
            System.out.println("Your Right and you win");
            break;
        }

        }


    }
    };
