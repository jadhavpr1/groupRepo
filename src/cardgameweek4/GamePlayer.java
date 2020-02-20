package cardgameweek4;

/**
 * A class to handle the user interaction for the Card project. Contains a main method that generates a card hand and
 * then iterates over it to print its contents to the console.
 *
 * @author dancye, 2019
 * @modified Paul Bonenfant Jan 2020
 */
public class GamePlayer {

    public static void main(String[] args) {
        CardHand cardHand = new CardHand();
        cardHand.generateHand();
        for (Card card : cardHand.cards) {
            System.out.println(card.getRank() + " of " + card.getColour());
        }
        // System.out.println(ch.cards); show what happens when there is no toString()
    }

}
