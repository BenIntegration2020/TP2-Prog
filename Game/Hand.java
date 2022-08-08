package Game;

import java.util.ArrayList;

public class Hand {
    private Card [] hand;
    private String user; //Soit le le joueur soit le courtier. Selon comment on appelle le constrcuteur et le paramertre quand utilise

    public Hand(String user) {
    }

    //retroune le tableau hand
    public Card[] getCards() {
    }

    // retourne la somme des cartes dans le tableau hand. Si la somme est >21, il faut recompter les cartes pour verifier si il y a un ACE. Si oui on le considere comme 1, sinon on ajoute la somme des points
    public int getPoints() {

    }

    // ajouter une carte au tableau
    public void addCard(Card card) {
    }

    //retourne true si la somme de deux cartes est égale à 21. False sinon
    public boolean isBlackjack() {

    }

    // retourne true si la somme des points a une valeur supérieur a 21. False sinon.
    public boolean isBust() {

    }

}