package io.zipcoder.casino;

import org.junit.Assert;
import org.junit.Test;

public class DeckBuilderTest {

    @Test
    public void isEmptyTest1() {

        //Given
        DeckBuilder builder = new DeckBuilder();

        //Then
        Assert.assertTrue(builder.isEmpty());

    }

    @Test
    public void isEmptyTest2() {

        //Given
        Deck deck = new Deck();
        deck.add(new Card(CardSuit.DIAMOND, CardValue.FIVE));

        DeckBuilder builder = new DeckBuilder(deck);

        //Then
        Assert.assertFalse(builder.isEmpty());

    }

    @Test
    public void clearTest1(){

        //Given
        Deck deck = new Deck();
        deck.add(new Card(CardSuit.DIAMOND, CardValue.FIVE));

        DeckBuilder builder = new DeckBuilder(deck);

        //When
        builder.clear();

        //Then
        Assert.assertTrue(builder.isEmpty());

    }

    @Test
    public void clearTest2(){

        //Given
        Deck deck = new Deck();
        deck.add(new Card(CardSuit.DIAMOND, CardValue.FIVE));
        deck.add(new Card(CardSuit.SPADE, CardValue.THREE));

        DeckBuilder builder = new DeckBuilder(deck);

        //When
        builder.clear();

        //Then
        Assert.assertTrue(builder.isEmpty());

    }

    @Test
    public void addSetTest1() {

        //Given
        DeckBuilder builder = new DeckBuilder().addSet();
        Deck deck = builder.build();

        //When
        Card[] expected = arrayOfSetOfCards();
        Card[] actual = deck.toArray();

        //Then
        Assert.assertTrue(assertArraysValueEqual(expected, actual));

    }

    @Test
    public void addMultipleSetsTest1(){

        //Given
        DeckBuilder builder = new DeckBuilder().addSet(2);
        Deck deck = builder.build();
        Card[] singleSet = arrayOfSetOfCards();
        Card[] multiSet = new Card[singleSet.length * 2];

        int index = 0;
        int setIndex = 0;
        int rounds = 0;
        while (rounds < 2) {
            multiSet[setIndex] = singleSet[index];
            setIndex++;

            if(index < singleSet.length - 1) {
                index++;
            }
            else {
                index = 0;
                rounds++;
            }
        }

        //When
        Card[] expected = multiSet;
        Card[] actual = deck.toArray();

        //Then
        Assert.assertTrue(assertArraysValueEqual(expected, actual));

    }

    @Test
    public void addMultipleSetsTest2(){

        //Given
        DeckBuilder builder = new DeckBuilder().addSet(4);
        Deck deck = builder.build();
        Card[] singleSet = arrayOfSetOfCards();
        Card[] multiSet = new Card[singleSet.length * 4];

        int index = 0;
        int setIndex = 0;
        int rounds = 0;
        while (rounds < 4) {
            multiSet[setIndex] = singleSet[index];
            setIndex++;

            if(index < singleSet.length - 1) {
                index++;
            }
            else {
                index = 0;
                rounds++;
            }
        }

        //When
        Card[] expected = multiSet;
        Card[] actual = deck.toArray();

        //Then
        Assert.assertTrue(assertArraysValueEqual(expected, actual));

    }

    @Test
    public void addMultipleSetsTest3(){

        //Given
        Integer numOfSets = 10;
        DeckBuilder builder = new DeckBuilder().addSet(numOfSets);
        Deck deck = builder.build();
        Card[] singleSet = arrayOfSetOfCards();
        Card[] multiSet = new Card[singleSet.length * numOfSets];

        int index = 0;
        int setIndex = 0;
        int rounds = 0;
        while (rounds < numOfSets) {
            multiSet[setIndex] = singleSet[index];
            setIndex++;

            if(index < singleSet.length - 1) {
                index++;
            }
            else {
                index = 0;
                rounds++;
            }
        }

        //When
        Card[] expected = multiSet;
        Card[] actual = deck.toArray();

        //Then
        Assert.assertTrue(assertArraysValueEqual(expected, actual));

    }

    @Test
    public void addMultipleSetsTest4(){

        //Given
        Integer numOfSets = 5;
        DeckBuilder builder = new DeckBuilder().addSet(numOfSets);
        Deck deck = builder.build();
        Card[] singleSet = arrayOfSetOfCards();
        Card[] multiSet = new Card[singleSet.length * numOfSets];

        int index = 0;
        int setIndex = 0;
        int rounds = 0;
        while (rounds < numOfSets) {
            multiSet[setIndex] = singleSet[index];
            setIndex++;

            if(index < singleSet.length - 1) {
                index++;
            }
            else {
                index = 0;
                rounds++;
            }
        }

        //When
        Card[] expected = multiSet;
        Card[] actual = deck.toArray();

        //Then
        Assert.assertTrue(assertArraysValueEqual(expected, actual));

    }

    @Test
    public void addSetWithJokersTest1(){

        //Given
        DeckBuilder builder = new DeckBuilder().addSetWithJokers();
        Deck deck = builder.build();

        //When
        Card[] expected = arrayOfSetWithJoker();
        Card[] actual = deck.toArray();

        //Then
        Assert.assertTrue(assertArraysValueEqual(expected, actual));
    }

    @Test
    public void addMultipleSetsWithJokersTest1() {

        //Given
        Integer numOfSets = 5;
        DeckBuilder builder = new DeckBuilder().addSetWithJokers(numOfSets);
        Deck deck = builder.build();
        Card[] singleSet = arrayOfSetWithJoker();
        Card[] multiSet = new Card[singleSet.length * numOfSets];

        int index = 0;
        int setIndex = 0;
        int rounds = 0;
        while (rounds < numOfSets) {
            multiSet[setIndex] = singleSet[index];
            setIndex++;

            if(index < singleSet.length - 1) {
                index++;
            }
            else {
                index = 0;
                rounds++;
            }
        }

        //When
        Card[] expected = multiSet;
        Card[] actual = deck.toArray();

        //Then
        Assert.assertTrue(assertArraysValueEqual(expected, actual));
    }

    @Test
    public void addMultipleSetsWithJokersTest2() {

        //Given
        Integer numOfSets = 2;
        DeckBuilder builder = new DeckBuilder().addSetWithJokers(numOfSets);
        Deck deck = builder.build();
        Card[] singleSet = arrayOfSetWithJoker();
        Card[] multiSet = new Card[singleSet.length * numOfSets];

        int index = 0;
        int setIndex = 0;
        int rounds = 0;
        while (rounds < numOfSets) {
            multiSet[setIndex] = singleSet[index];
            setIndex++;

            if(index < singleSet.length - 1) {
                index++;
            }
            else {
                index = 0;
                rounds++;
            }
        }

        //When
        Card[] expected = multiSet;
        Card[] actual = deck.toArray();

        //Then
        Assert.assertTrue(assertArraysValueEqual(expected, actual));
    }

    @Test
    public void addJokerTest(){

        //Given
        DeckBuilder builder = new DeckBuilder().addJokers();
        Deck deck = builder.build();

        //When
        Card[] expected = {new Card(CardSuit.NONE, CardValue.JOKER),
                new Card(CardSuit.NONE, CardValue.JOKER)

        };
        Card[] actual = deck.toArray();

        //Then
        Assert.assertTrue(assertArraysValueEqual(expected, actual));
    }

    @Test
    public void addHeartsTest(){

        //Given
        DeckBuilder builder = new DeckBuilder().addHearts();
        Deck deck = builder.build();

        //When
        Card[] expected = {new Card(CardSuit.HEART, CardValue.ACE),
                new Card(CardSuit.HEART, CardValue.TWO),
                new Card(CardSuit.HEART, CardValue.THREE),
                new Card(CardSuit.HEART, CardValue.FOUR),
                new Card(CardSuit.HEART, CardValue.FIVE),
                new Card(CardSuit.HEART, CardValue.SIX),
                new Card(CardSuit.HEART, CardValue.SEVEN),
                new Card(CardSuit.HEART, CardValue.EIGHT),
                new Card(CardSuit.HEART, CardValue.NINE),
                new Card(CardSuit.HEART, CardValue.TEN),
                new Card(CardSuit.HEART, CardValue.JACK),
                new Card(CardSuit.HEART, CardValue.QUEEN),
                new Card(CardSuit.HEART, CardValue.KING)
        };
        Card[] actual = deck.toArray();

        //Then
        Assert.assertTrue(assertArraysValueEqual(expected, actual));

    }

    @Test
    public void addDiamondsTest() {

        //Given
        DeckBuilder builder = new DeckBuilder().addDiamonds();
        Deck deck = builder.build();

        //When
        Card[] expected = {
                new Card(CardSuit.DIAMOND, CardValue.ACE),
                new Card(CardSuit.DIAMOND, CardValue.TWO),
                new Card(CardSuit.DIAMOND, CardValue.THREE),
                new Card(CardSuit.DIAMOND, CardValue.FOUR),
                new Card(CardSuit.DIAMOND, CardValue.FIVE),
                new Card(CardSuit.DIAMOND, CardValue.SIX),
                new Card(CardSuit.DIAMOND, CardValue.SEVEN),
                new Card(CardSuit.DIAMOND, CardValue.EIGHT),
                new Card(CardSuit.DIAMOND, CardValue.NINE),
                new Card(CardSuit.DIAMOND, CardValue.TEN),
                new Card(CardSuit.DIAMOND, CardValue.JACK),
                new Card(CardSuit.DIAMOND, CardValue.QUEEN),
                new Card(CardSuit.DIAMOND, CardValue.KING)
        };
        Card[] actual = deck.toArray();

        //Then
        Assert.assertTrue(assertArraysValueEqual(expected, actual));

    }

    @Test
    public void addClubsTest() {

        //Given
        DeckBuilder builder = new DeckBuilder().addClubs();
        Deck deck = builder.build();

        //When
        Card[] expected = {new Card(CardSuit.CLUB, CardValue.ACE),
                new Card(CardSuit.CLUB, CardValue.TWO),
                new Card(CardSuit.CLUB, CardValue.THREE),
                new Card(CardSuit.CLUB, CardValue.FOUR),
                new Card(CardSuit.CLUB, CardValue.FIVE),
                new Card(CardSuit.CLUB, CardValue.SIX),
                new Card(CardSuit.CLUB, CardValue.SEVEN),
                new Card(CardSuit.CLUB, CardValue.EIGHT),
                new Card(CardSuit.CLUB, CardValue.TEN),
                new Card(CardSuit.CLUB, CardValue.NINE),
                new Card(CardSuit.CLUB, CardValue.JACK),
                new Card(CardSuit.CLUB, CardValue.QUEEN),
                new Card(CardSuit.CLUB, CardValue.KING)
        };
        Card[] actual = deck.toArray();

        //Then
        Assert.assertTrue(assertArraysValueEqual(expected, actual));
    }

    @Test
    public void addSpadesTest() {

        //Given
        DeckBuilder builder = new DeckBuilder().addSpades();
        Deck deck = builder.build();

        //When
        Card[] expected = {new Card(CardSuit.SPADE, CardValue.ACE),
                new Card(CardSuit.SPADE, CardValue.TWO),
                new Card(CardSuit.SPADE, CardValue.THREE),
                new Card(CardSuit.SPADE, CardValue.FOUR),
                new Card(CardSuit.SPADE, CardValue.FIVE),
                new Card(CardSuit.SPADE, CardValue.SIX),
                new Card(CardSuit.SPADE, CardValue.SEVEN),
                new Card(CardSuit.SPADE, CardValue.EIGHT),
                new Card(CardSuit.SPADE, CardValue.NINE),
                new Card(CardSuit.SPADE, CardValue.TEN),
                new Card(CardSuit.SPADE, CardValue.JACK),
                new Card(CardSuit.SPADE, CardValue.QUEEN),
                new Card(CardSuit.SPADE, CardValue.KING)
        };
        Card[] actual = deck.toArray();

        //Then
        Assert.assertTrue(assertArraysValueEqual(expected, actual));

    }

    @Test
    public void shuffleTest1() {

        //Given
        DeckBuilder builder = new DeckBuilder().addSet().shuffle();
        Deck deck = builder.build();

        //When
        Card[] expected = arrayOfSetOfCards();
        Card[] actual = deck.toArray();

        //Then
        Assert.assertFalse(assertArraysValueEqual(expected, actual));

    }

    @Test
    public void shuffleTest2(){

        //Given
        Integer numOfSets = 5;
        DeckBuilder builder = new DeckBuilder().addSet(numOfSets).shuffle();
        Deck deck = builder.build();
        Card[] singleSet = arrayOfSetOfCards();
        Card[] multiSet = new Card[singleSet.length * numOfSets];

        int index = 0;
        int setIndex = 0;
        int rounds = 0;
        while (rounds < numOfSets) {
            multiSet[setIndex] = singleSet[index];
            setIndex++;

            if(index < singleSet.length - 1) {
                index++;
            }
            else {
                index = 0;
                rounds++;
            }
        }

        //When
        Card[] expected = multiSet;
        Card[] actual = deck.toArray();

        //Then
        Assert.assertFalse(assertArraysValueEqual(expected, actual));

    }

    @Test
    public void shuffleTest3() {

        //Given
        Integer numOfSets = 2;
        DeckBuilder builder = new DeckBuilder().addSetWithJokers(numOfSets);
        Deck deck = builder.build();
        Card[] singleSet = arrayOfSetWithJoker();
        Card[] multiSet = new Card[singleSet.length * numOfSets];

        int index = 0;
        int setIndex = 0;
        int rounds = 0;
        while (rounds < numOfSets) {
            multiSet[setIndex] = singleSet[index];
            setIndex++;

            if(index < singleSet.length - 1) {
                index++;
            }
            else {
                index = 0;
                rounds++;
            }
        }

        //When
        Card[] expected = multiSet;
        Card[] actual = deck.toArray();

        //Then
        Assert.assertTrue(assertArraysValueEqual(expected, actual));
    }

    public Card[] arrayOfSetOfCards() {

        Card[] cards = {
                new Card(CardSuit.HEART, CardValue.ACE),
                new Card(CardSuit.HEART, CardValue.TWO),
                new Card(CardSuit.HEART, CardValue.THREE),
                new Card(CardSuit.HEART, CardValue.FOUR),
                new Card(CardSuit.HEART, CardValue.FIVE),
                new Card(CardSuit.HEART, CardValue.SIX),
                new Card(CardSuit.HEART, CardValue.SEVEN),
                new Card(CardSuit.HEART, CardValue.EIGHT),
                new Card(CardSuit.HEART, CardValue.NINE),
                new Card(CardSuit.HEART, CardValue.TEN),
                new Card(CardSuit.HEART, CardValue.JACK),
                new Card(CardSuit.HEART, CardValue.QUEEN),
                new Card(CardSuit.HEART, CardValue.KING),

                new Card(CardSuit.DIAMOND, CardValue.ACE),
                new Card(CardSuit.DIAMOND, CardValue.TWO),
                new Card(CardSuit.DIAMOND, CardValue.THREE),
                new Card(CardSuit.DIAMOND, CardValue.FOUR),
                new Card(CardSuit.DIAMOND, CardValue.FIVE),
                new Card(CardSuit.DIAMOND, CardValue.SIX),
                new Card(CardSuit.DIAMOND, CardValue.SEVEN),
                new Card(CardSuit.DIAMOND, CardValue.EIGHT),
                new Card(CardSuit.DIAMOND, CardValue.NINE),
                new Card(CardSuit.DIAMOND, CardValue.TEN),
                new Card(CardSuit.DIAMOND, CardValue.JACK),
                new Card(CardSuit.DIAMOND, CardValue.QUEEN),
                new Card(CardSuit.DIAMOND, CardValue.KING),

                new Card(CardSuit.CLUB, CardValue.ACE),
                new Card(CardSuit.CLUB, CardValue.TWO),
                new Card(CardSuit.CLUB, CardValue.THREE),
                new Card(CardSuit.CLUB, CardValue.FOUR),
                new Card(CardSuit.CLUB, CardValue.FIVE),
                new Card(CardSuit.CLUB, CardValue.SIX),
                new Card(CardSuit.CLUB, CardValue.SEVEN),
                new Card(CardSuit.CLUB, CardValue.EIGHT),
                new Card(CardSuit.CLUB, CardValue.TEN),
                new Card(CardSuit.CLUB, CardValue.NINE),
                new Card(CardSuit.CLUB, CardValue.JACK),
                new Card(CardSuit.CLUB, CardValue.QUEEN),
                new Card(CardSuit.CLUB, CardValue.KING),

                new Card(CardSuit.SPADE, CardValue.ACE),
                new Card(CardSuit.SPADE, CardValue.TWO),
                new Card(CardSuit.SPADE, CardValue.THREE),
                new Card(CardSuit.SPADE, CardValue.FOUR),
                new Card(CardSuit.SPADE, CardValue.FIVE),
                new Card(CardSuit.SPADE, CardValue.SIX),
                new Card(CardSuit.SPADE, CardValue.SEVEN),
                new Card(CardSuit.SPADE, CardValue.EIGHT),
                new Card(CardSuit.SPADE, CardValue.NINE),
                new Card(CardSuit.SPADE, CardValue.TEN),
                new Card(CardSuit.SPADE, CardValue.JACK),
                new Card(CardSuit.SPADE, CardValue.QUEEN),
                new Card(CardSuit.SPADE, CardValue.KING)
        };

        return cards;

    }

    public Card[] arrayOfSetWithJoker() {

        Card[] cards = {
                new Card(CardSuit.HEART, CardValue.ACE),
                new Card(CardSuit.HEART, CardValue.TWO),
                new Card(CardSuit.HEART, CardValue.THREE),
                new Card(CardSuit.HEART, CardValue.FOUR),
                new Card(CardSuit.HEART, CardValue.FIVE),
                new Card(CardSuit.HEART, CardValue.SIX),
                new Card(CardSuit.HEART, CardValue.SEVEN),
                new Card(CardSuit.HEART, CardValue.EIGHT),
                new Card(CardSuit.HEART, CardValue.NINE),
                new Card(CardSuit.HEART, CardValue.TEN),
                new Card(CardSuit.HEART, CardValue.JACK),
                new Card(CardSuit.HEART, CardValue.QUEEN),
                new Card(CardSuit.HEART, CardValue.KING),

                new Card(CardSuit.DIAMOND, CardValue.ACE),
                new Card(CardSuit.DIAMOND, CardValue.TWO),
                new Card(CardSuit.DIAMOND, CardValue.THREE),
                new Card(CardSuit.DIAMOND, CardValue.FOUR),
                new Card(CardSuit.DIAMOND, CardValue.FIVE),
                new Card(CardSuit.DIAMOND, CardValue.SIX),
                new Card(CardSuit.DIAMOND, CardValue.SEVEN),
                new Card(CardSuit.DIAMOND, CardValue.EIGHT),
                new Card(CardSuit.DIAMOND, CardValue.NINE),
                new Card(CardSuit.DIAMOND, CardValue.TEN),
                new Card(CardSuit.DIAMOND, CardValue.JACK),
                new Card(CardSuit.DIAMOND, CardValue.QUEEN),
                new Card(CardSuit.DIAMOND, CardValue.KING),

                new Card(CardSuit.CLUB, CardValue.ACE),
                new Card(CardSuit.CLUB, CardValue.TWO),
                new Card(CardSuit.CLUB, CardValue.THREE),
                new Card(CardSuit.CLUB, CardValue.FOUR),
                new Card(CardSuit.CLUB, CardValue.FIVE),
                new Card(CardSuit.CLUB, CardValue.SIX),
                new Card(CardSuit.CLUB, CardValue.SEVEN),
                new Card(CardSuit.CLUB, CardValue.EIGHT),
                new Card(CardSuit.CLUB, CardValue.TEN),
                new Card(CardSuit.CLUB, CardValue.NINE),
                new Card(CardSuit.CLUB, CardValue.JACK),
                new Card(CardSuit.CLUB, CardValue.QUEEN),
                new Card(CardSuit.CLUB, CardValue.KING),

                new Card(CardSuit.SPADE, CardValue.ACE),
                new Card(CardSuit.SPADE, CardValue.TWO),
                new Card(CardSuit.SPADE, CardValue.THREE),
                new Card(CardSuit.SPADE, CardValue.FOUR),
                new Card(CardSuit.SPADE, CardValue.FIVE),
                new Card(CardSuit.SPADE, CardValue.SIX),
                new Card(CardSuit.SPADE, CardValue.SEVEN),
                new Card(CardSuit.SPADE, CardValue.EIGHT),
                new Card(CardSuit.SPADE, CardValue.NINE),
                new Card(CardSuit.SPADE, CardValue.TEN),
                new Card(CardSuit.SPADE, CardValue.JACK),
                new Card(CardSuit.SPADE, CardValue.QUEEN),
                new Card(CardSuit.SPADE, CardValue.KING),

                new Card(CardSuit.NONE, CardValue.JOKER),
                new Card(CardSuit.NONE, CardValue.JOKER)
        };

        return cards;

    }

    public Boolean assertArraysValueEqual(Card[] cards1, Card[] cards2) {

        if(cards1.length == cards2.length) {
            for(int i = 0; i < cards1.length; i ++) {
                String stringCard1 = cards1[i].toString();
                String stringCard2 = cards2[i].toString();
                if(!stringCard1.equals(stringCard2)) return false;
            }
        }
        else {
            return false;
        }

        return true;
    }

}
