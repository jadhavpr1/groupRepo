package cardgameweek4;

/**
 * Starter code for the Card class. To be used in Week 4.
 *
 * 4.one OO principle that allowed you to reuse your original Card code and extend it to become an uno desk is
 * cohesion which is used to maintain the format of code as it is.So this is the reason the code of both the decks
 * are almost the same.
 *5.One more fact is that autommetic generation of enums,setters and getters are their for easy use
 * @Savita Savita ,2019
 * @author dancye, 2019
 * @modified Paul Bonenfant Jan 2020
 */
public class Card {

    //
    public enum Colour {
    RED, YELLOW, GREEN, BLUE;
    };

    public enum Rank
    {
        ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD
    };
    private final Colour colour;
    private final Rank rank;

    public Card(Colour colour, Rank rank) {
        this.colour = colour;
        this.rank = rank;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Colour getColour() {
        return this.colour;
    }
}
