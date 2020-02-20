package cardgameweek4;

/**
 * a class that models the Card Hand. A Card hand has an array of cards. 
 * How can you change the size of the hand? how big is it right now?
 *
 * @author dancye, 2019.
 * @modified Paul Bonenfant Jan 2020
 */

public class CardHand {

    private int handSize = 75;
    public Card[] cards = new Card[handSize];

    /**
     * Generates a standard deck of cards
     */
    public void generateHand() {
        int countCards = 0;
        for (Card.Colour colour : Card.Colour.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards[countCards] = (new Card(colour, rank));
                countCards++;
            }
        }//end outer for
    }//end method
}
