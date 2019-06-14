package io.zipcoder.casino.continental;

import io.zipcoder.casino.*;

import java.util.List;
import java.util.Stack;


public class Continental extends CardGame{

    private Deck deck;
    private Stack<Card> pile;
    private ContinentalPlayer player;
    private ContinentalMediator mediator;
    private Hand dealerHand;
    private List<ValueSet> valueSets;
    private List<StraightSet> straightSets;


    /**
     * @return gets card from top of Deck.
     */
    public Card drawFromDeck() {
        return null;
    }

    public Card drawFromPile() { return null; }

    /**
     * This method compares all cards see if they have the same value.
     * @param card1 This is a card from a Hand
     * @param card2 This is a card from a Hand
     * @param card3 This is a card from a Hand
     * @return True or False depending if the values match or not
     */
    public Boolean isThreeOfAKind(Card card1, Card card2, Card card3){
        return null;
    }

    /**
     *
     */




}
