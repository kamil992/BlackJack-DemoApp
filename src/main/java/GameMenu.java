import java.util.Scanner;
import java.util.Set;


public class GameMenu {

    public void play() {
        //show main option
        getMainOptions();
        GameBoard gameBoard = new GameBoard();
        Set<Card> cardsSet = gameBoard.shuffleStack();
        //get result of the croupiers game
        int croupierResult = gameBoard.getCroupierResult();
        //index of card fro stack
        int index = 0;
        Scanner sc = new Scanner(System.in);
        String button;
        int yourPoints = 0;
        do {
            getGameOptions();
            button = sc.nextLine();
            switch (button) {
                case ("1"):
                    Card card = gameBoard.getCardFromStack(index, cardsSet);
                    index++;
                    getCardInfo(card);
                    //if card is ace you can choose which value this will have : 11 or 1
                    if(isAce(card.getFigure())){
                        changeAceValue(card);
                    }
                    yourPoints += card.getValue();
                    if(yourPoints > 21){
                        System.out.println("You lost this game.");
                        button = "0";
                    }
                    checkResult(yourPoints);
                    break;
                case ("2"):
                    checkFinalResult(yourPoints, croupierResult);
                    button = "0";
                    break;
                case ("0"):
                    break;

                default:
                    System.out.println("You entered wrong data!");
                    break;
            }
        } while (!button.equalsIgnoreCase("0"));
    }

    private static void checkFinalResult(int yoursPoints, int croupiersPoints){
        System.out.println("Yours points: " + yoursPoints);
        System.out.println("Croupiers points: " + croupiersPoints);

        if(yoursPoints > croupiersPoints || croupiersPoints > 21) {
            System.out.println("You win.");
        }else if(yoursPoints < croupiersPoints && croupiersPoints <= 21){
            System.out.println("You lost.");
        }else{
            System.out.println("Dead-heat.");
        }
    }

    private static void checkResult(int points){
        System.out.println("You have " + points + " points.");
    }


    private static void getCardInfo(Card card){
        System.out.println("--------------------------------");
        System.out.println(card.getFigure() + " : " + card.getColour());
        System.out.println("--------------------------------");
    }


    private static void changeAceValue(Card card){
        Scanner sc = new Scanner(System.in);
        System.out.println("Would You like to change points value of Ace to 1? [Y / N]" );
        String answer;
        answer = sc.nextLine();
        if(answer.equalsIgnoreCase("Y")){
            card.setValue(1);
        }
    }

    private static boolean isAce(String figure) {
        if (figure.equalsIgnoreCase("Ace")) {
            return true;
        }
        return false;
    }

    private static void getGameOptions() {
        System.out.println("[1] Hit");
        System.out.println("[2] Stand");
    }

    private static void getMainOptions() {
        System.out.println("Welcome to BlackJack demo game. Insert [1] to hit the card.\n" +
                "If You would like to stop game - press [0]");
        System.out.println("_____________________________________________________________________");
    }
}
