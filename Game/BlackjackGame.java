package Game;
public class BlackjackGame {
    private final Hand playerHand;
    private final Hand dealerHand;
    //private final Deck deck;
    private double betAmount;
    private final double minBet;
    private final double maxBet;
    private double totalMoney;

    //Initialiser deck, playerHand, dealerHand, minBet et maxBet
    //le minimum et le maximum de la mise sont de 5 et 1000 respectivement.
    public BlackjackGame() {
    }

    public void loadMoney() {
        totalMoney = 100;
    }

    //retourne true le total d’argent dont un joueur dispose est inférieur au minimum de mise. False sinon.
    public boolean isOutOfMoney() {
    }

    // pour initialiser totalMoney a 100
    public void resetMoney() {
    }

    //retourne false si double localBetAmt est inférieur au minBet ou supérieur au maxBet ou supérieur au totalMoney. True sinon.
    public boolean isValidBet(double localBetAmt) {
    }

    //retourner minBet
    public double getMinBet() {
    }

    //retourner le montant total que le joeur peut l'utiliser pour la mise.
    public double getMaxBet() {
    }

    // pour retrouner le montant total
    public double getTotalMoney() {
    }

    //pour intialiser le montant de la mise qu'on va le faire
    public void setBet(double amt) {
    }

    // distribue deux cartes pour le joueur (playerHand) et deux cartes pour le courtier (dealerHand).
    public void deal() {
    }

    //pour distribuer une carte en plus pour le joueur dans le cas où il fait hit.
    public void hit() {
    }

    //qui ajoute des cartes au main du courtier tant que la somme des points dont il dispose est moins que 17.
    public void stand() {
    }

    //retourne le deuxième carte dans la main du courtier.
    public Card getDealerShowCard() {
    }

    //retourne dealerHand
    public Hand getDealerHand() {
    }

    //retourne playerHand
    public Hand getPlayerHand() {

    }

    // ice cream
    public boolean isBlackjackOrBust() {
        if(playerHand.isBlackjack() || playerHand.isBust()
                || dealerHand.isBlackjack() || dealerHand.isBust()) {
            return true;
        } else{
            return false;
        }
    }

    //retourne true si les points dans la main de joueur est inférieur ou égale 21 et ces points sont égales aux points avec le courtier. False sinon.
    public boolean isPush() {
    }


    //retourne true si le player gagne. False sinon.
    public boolean playerWins() {
    }

    // ajoute le montant du mise gagner au montant total
    public void addBetToTotal() {
    }

    // ajoute le montant de mise gagner selon 3:2 au montant total dans le cas de blackjack
    public void addBlackjackToTotal() {
    }

    // soustraire le montant du bet perdu du montant total
    public void subtractBetFromTotal() {
    }

}