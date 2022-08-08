package Game;

public class Deck {
    private Card[] deck;
    private int currentCardIndex;

    //stocke les cartes dans  Card[ ] deck et ensuite il appelle la fonction shuflleDeck().
    public Deck(int currentCardIndex) {
        int i = 0;
        this.currentCardIndex = i;
        Card[] deck = new Card[52];
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        for(i = 0; i < 4; currentCardIndex++) {

            for (int j = 0; j < i; j++) {
                deck[currentCardIndex] = new Card(suits[i], ranks[j]);
            }
           currentCardIndex = this.currentCardIndex;
        }
    }


    //shuffleDeck, pour mélanger les cartes à l'aide de l'algorithme de mélange de Fisher-Yates:
    //https://www.geeksforgeeks.org/shuffle-a-given-array-using-fisher-yates-shuffle-algorithm/
    private void shuffleDeck() {
    }

    public Card drawCard() {
        if(currentCardIndex == 51) {
            Card currCard = deck[currentCardIndex];
            shuffleDeck();
            return currCard;
        }
        else {
            return deck[currentCardIndex++];
        }
    }

}