import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args) {
<<<<<<< Updated upstream
        Scanner scanMan;
=======
        Scanner keyboard;
        keyboard = new Scanner(System.in);
>>>>>>> Stashed changes
        int value;
        int testing;
        String question;

<<<<<<< Updated upstream
        
=======

        System.out.println("Hello, think of a question you have then type a number between 1-100");
        int firstNumber = keyboard.nextInt();

        if (1 < firstNumber & firstNumber < 10 ) {
            System.out.println("That ain't happening.");
            }

            else if (11 < firstNumber & firstNumber < 20) {
            System.out.println("I don't see that happening.");

            }

            else if (21 < firstNumber & firstNumber < 30){
            System.out.println("I see that as a very real possibility");
        }

            else if (31 < firstNumber & firstNumber <40){
            System.out.println("It is certain");
        }

            else if (41 < firstNumber & firstNumber <50){
            System.out.println("That is gonna happen");
        }
            else if (51 < firstNumber & firstNumber <60){
            System.out.println("That could happen");
        }

            else if (61 < firstNumber & firstNumber <70){
            System.out.println("Never gonna happen");
            }

            else if (71 < firstNumber & firstNumber <80){
            System.out.println("That is most likely gonna happen");
            }

            else if (81 < firstNumber & firstNumber <90){
            System.out.println("Yeah you wish");
        }

            else if (91 < firstNumber & firstNumber <100){
            System.out.println("Never in your wildest dreams");
        }












>>>>>>> Stashed changes












    }




}
