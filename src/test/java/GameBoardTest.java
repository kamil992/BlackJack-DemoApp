
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;
public class GameBoardTest {
    GameBoard gameBoard = new GameBoard();

    @Test
    public void croupierTest(){
        int croupierResult = gameBoard.getCroupierResult();
        assertTrue("croupierResult should equals more than 16", croupierResult > 16);
    }

    @Test
    public void cardsTest(){
        Set<Card> cardsSet =  gameBoard.shuffleStack();

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(i == j)
                    continue;

                assertFalse("There are same cards!!!",
                        gameBoard.getCardFromStack(i, cardsSet).getFigure().equals(gameBoard.getCardFromStack(j, cardsSet).getFigure()) &&
                                gameBoard.getCardFromStack(i, cardsSet).getColour().equals(gameBoard.getCardFromStack(j, cardsSet).getColour()));
            }
        }
    }

}
