import java.util.HashSet;
import java.util.Set;

public class GameBoard {

    private Card[] cards;
    private Set<Card> cardSet;

    public int getCroupierResult(){
        this.shuffleStack();
        int result = 0;
        int cardIndex = 0;
        Card card;
        while(result <= 16) {
            card = getCardFromStack(cardIndex, this.shuffleStack());
            cardIndex++;
            result += card.getValue();
        }
        return result;
    }

    //to not to lose you can hit at most 8 cards
    public Card getCardFromStack(int index, Set<Card> cardsSet) {
        Card[] card = new Card[9];
        cardsSet.toArray(card);
        return card[index];
    }

    // get set with unique cards
    public Set<Card> shuffleStack(){
        cardSet = new HashSet<Card>();
        Card[] card = this.getCards();
        int index = 0;
        while(cardSet.size() != 9){
            index = (int) Math.floor(Math.random() * 52);
            cardSet.add(card[index]);
        }
        return cardSet;
    }



    public Card[] getCards() {
        cards = new Card[52];

        cards[0] = new Card("2", "diamonds", 2);
        cards[1] = new Card("2", "clubs", 2);
        cards[2] = new Card("2", "hearts", 2);
        cards[3] = new Card("2", "spades", 2);
        cards[4] = new Card("3", "diamonds", 3);
        cards[5] = new Card("3", "clubs", 3);
        cards[6] = new Card("3", "hearts", 3);
        cards[7] = new Card("3", "spades", 3);
        cards[8] = new Card("4", "diamonds", 4);
        cards[9] = new Card("4", "clubs", 4);
        cards[10] = new Card("4", "hearts", 4);
        cards[11] = new Card("4", "spades", 4);
        cards[12] = new Card("5", "diamonds", 5);
        cards[13] = new Card("5", "clubs", 5);
        cards[14] = new Card("5", "hearts", 5);
        cards[15] = new Card("5", "spades", 5);
        cards[16] = new Card("6", "diamonds", 6);
        cards[17] = new Card("6", "clubs", 6);
        cards[18] = new Card("6", "hearts", 6);
        cards[19] = new Card("6", "spades", 6);
        cards[20] = new Card("7", "diamonds", 7);
        cards[21] = new Card("7", "clubs", 7);
        cards[22] = new Card("7", "hearts", 7);
        cards[23] = new Card("7", "spades", 7);
        cards[24] = new Card("8", "diamonds", 8);
        cards[25] = new Card("8", "clubs", 8);
        cards[26] = new Card("8", "hearts", 8);
        cards[27] = new Card("8", "spades", 8);
        cards[28] = new Card("9", "diamonds", 9);
        cards[29] = new Card("9", "clubs", 9);
        cards[30] = new Card("9", "hearts", 9);
        cards[31] = new Card("9", "spades", 9);
        cards[32] = new Card("10", "diamonds", 10);
        cards[33] = new Card("10", "clubs", 10);
        cards[34] = new Card("10", "hearts", 10);
        cards[35] = new Card("10", "spades", 10);
        cards[36] = new Card("Jack", "diamonds", 10);
        cards[37] = new Card("Jack", "clubs", 10);
        cards[38] = new Card("Jack", "hearts", 10);
        cards[39] = new Card("Jack", "spades", 10);
        cards[40] = new Card("Queen", "diamonds", 10);
        cards[41] = new Card("Queen", "clubs", 10);
        cards[42] = new Card("Queen", "hearts", 10);
        cards[43] = new Card("Queen", "spades", 10);
        cards[44] = new Card("King", "diamonds", 10);
        cards[45] = new Card("King", "clubs", 10);
        cards[46] = new Card("King", "hearts", 10);
        cards[47] = new Card("King", "spades", 10);
        cards[48] = new Card("Ace", "diamonds", 11);
        cards[49] = new Card("Ace", "clubs", 11);
        cards[50] = new Card("Ace", "hearts", 11);
        cards[51] = new Card("Ace", "spades", 11);

        return cards;
    }

}
