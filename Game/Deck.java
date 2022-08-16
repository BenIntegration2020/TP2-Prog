package Game;

public class Deck {
    private Card[] deck;
    private int currentCardIndex;

    //stocke les cartes dans  Card[ ] deck et ensuite il appelle la fonction shuflleDeck().
    public Deck() {
        int i = 0;
        this.currentCardIndex = i;
        deck = new Card[52];
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] points = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 11};
        for(i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[currentCardIndex++] = new Card(suits[i], ranks[j], points[j]);
            }
        }
        shuffleDeck();
    }


    //shuffleDeck, pour mélanger les cartes à l'aide de l'algorithme de mélange de Fisher-Yates:
    //https://www.geeksforgeeks.org/shuffle-a-given-array-using-fisher-yates-shuffle-algorithm/
    private void shuffleDeck() {
        for (int i = 51; i > 0; i--){
            int j = (int)(Math.random()*52);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
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