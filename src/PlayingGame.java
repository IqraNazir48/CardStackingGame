import java.util.*;
public class PlayingGame {
    public static void main(String[] args) {
        int play = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Welcome to the Card Stacking Game!----------");
        System.out.println("--------------Here are the card values:---------------");
        System.out.println("---------Ace: 1, Jack: 11, Queen: 12, King: 13--------");
        System.out.println("Other cards: Enter their respective numbers (2-10)");
        System.out.println("---------------Let's start the game!------------------");
        while (play == 1) {
            CardStack stack = new CardStack();
            for (int i = 1; i <= 10; i++) {
                System.out.println("Turn : " + i);
                int data = (int) (Math.random() * 13) + 1;
                while(stack.isPresent(data)){
                    data=(int) (Math.random() * 13) + 1;
                }

                System.out.println("Current card: " + stack.getCardName(data));
                stack.push(data);
                stack.display();
                System.out.println();
                System.out.println("Current score: " + stack.score);
                System.out.println();

                if(stack.size()>=5 && i<=9){
                    System.out.println("You got it in just "+i+" attempts...");
                    break;
                }
            }
            if (stack.size() >= 5) {
                System.out.println("_____Congratulations!!!______");
                System.out.println("_________You won!!___________");
                System.out.println("You stacked 5 cards successfully!!!");
                System.out.println("--------You rock!!!----------");
            } else {
                System.out.println("_________Ah! You Lost the Game______");
                System.out.println("You did not stack 5 cards....");
                System.out.println("Better luck next time!!!!");
            }

            System.out.println("Your final Score:  " + stack.score);
            System.out.println();
            System.out.println("---------Your final Card Stack!!---------");
            stack.display();
            System.out.println("If you want to continue game: Enter 1....");
            System.out.println("OtherWise : Enter 2 to quit...");
            play = sc.nextInt();
            while(play>2 || play<1){
                System.out.println("Please Enter correct choice...");
                play=sc.nextInt();
            }
            if(play==1){
                System.out.println("---------Lets start again--------");
            }
        }
    }
}
