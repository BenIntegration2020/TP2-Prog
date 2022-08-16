package Game;

public class BlackjackApp {

    private static BlackjackGame game;

    public static void main(String[] args) {
        System.out.println();
        System.out.println("BLACKJACK!");
        System.out.println("Blackjack payout is 3:2");
        System.out.println();

        String playAgain = "y";
        String[] choice = {"y", "n"};
        while(playAgain.equalsIgnoreCase("y")) {
            // votre scenario de simulation vient ici

            //créer une instance de BlackJackGame -> new BlackJackGame(playerHand, dealerHand, deck, betAmount )

           //getTotalMoney (afficher)
            //prompt de betAmount

            //saisir betAmount
            //showDealerCard()

            //deal() pour créer ajouter deux cartes au playerHand et au dealerHand
            //afficher les cartes de playerHand sous forme de tableau à deux lignes boucle?

            //getHitOrStand()

            //Afficher cartes de playerHand sous forme de tableau si hit
            //Afficher cartes du dealer

            //message win ou lose

            //getTotalMoney()

            //playAgain = Console.getString("Do you want to play again?", choice);
        }
        System.out.println("\nBye!");
    }

    // affiche le message Out of money! Would you like to add more? (y/n):. Si le joueur tappe y alors la fonction reset la balance du joueur au 100 et retourne true. False Sinon.
    private static boolean buyMoreChips() {
        System.out.println("Out of money!");
        String[] allowedValues = {"y", "n"};
        String userResponse = Console.getString("Would you like to add more? (y/n): ", allowedValues);
        return userResponse.equalsIgnoreCase("y");
    }

    // affiche le message Bet amount, lire la valeur de la mise saisi par le joueur. Valide cette valeur. Si la valeur n'est pas valide afficher le message Bet must be between
    private static void getBetAmount() {

        Double userResponse = Console.getDouble("How much do you want to bet?");
        boolean validBet = game.isValidBet(userResponse);
        if(!validBet)
            System.out.println("Bet must be between:" + game.getMinBet() + "and" + game.getMaxBet());
    }

    // Affiche le message Hit or Stand? (h/s): et puis retourne ce que le joueur a tappe.
    private static String getHitOrStand() {
    String[] allowedValues = {"h", "s"};
    String userResponse = Console.getString("Hit or Stand? (h/s): ", allowedValues);
        return userResponse;
    }

    // affiche les cartes dans la main du courtier et les cartes dans la main du joueur
    private static void showHands() {
        showDealerShowCard();
    }

    // affiche le message DEALER'S SHOW CARD et puis affiche le deuxieme carte dans la main du courtier
    private static void showDealerShowCard() {
        System.out.println("DEALER'S SHOW CARD");
        System.out.println(game.getDealerShowCard());
    }

    // affiche le message DEALER'S CARDS et puis affiche les cartes dans la main du courtier
    private static void showDealerHand() {
        System.out.println("DEALER'S CARDS");
        System.out.println(game.getDealerHand());
    }

    // affiche le message YOUR CARDS et puis affiche les cartes dans la main du joueur
    private static void showPlayerHand() {
        System.out.println("YOUR CARDS: " + game.getPlayerHand());
    }

    // affiche Total money:  et le montant total
    private static void showMoney() {
        System.out.println("Total Money: " + game.getTotalMoney());
    }


    private static void showWinner() {
        showPlayerHand();
        System.out.printf("YOUR POINTS: %d%n", game.getPlayerHand().getPoints());

        showDealerHand();
        System.out.printf("DEALER'S POINTS: %d%n%n", game.getDealerHand().getPoints());

        if(game.isPush()) {
            System.out.println("Push!");
        } else if(game.getPlayerHand().isBlackjack()) {
            System.out.println("BLACKJACK! You win!");
            game.addBlackjackToTotal();
        } else if (game.playerWins()) {
            System.out.println("You win!");
            game.addBetToTotal();
        } else {
            System.out.println("Sorry, you lose.");
            game.subtractBetFromTotal();
        }
        showMoney();
        //game.saveMoney();
    }
}
