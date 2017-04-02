/* CardDeck.java */
/* Date  : 24 February 2016
 * Author: Ankit Pati
 */

import java.util.*;

enum Suit {
    SPADES(100), HEARTS(200), DIAMONDS(300), CLUBS(400); /* Unicode ordering */

    private int num;

    Suit(int number) {
        num = number;
    }

    public int number() {
        return num;
    }
};

class Card implements Comparable<Card> {
    Suit suit;
    int  rank;

    /* constructors */
    public Card() {
        this(Suit.HEARTS, 12); /* Queen of Hearts */
    }

    public Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }
    /* end of constructors */

    /* overridden methods */
    public String toString() {
        return (rank > 1 && rank < 11 ? rank : rank == 1 ? "Ace" :
                rank == 11 ? "Jack" : rank == 12 ? "Queen" : "King")
               + " of " + suit.toString();
    }

    public int compareTo(Card card) {
        return (suit.number() + rank) - (card.suit.number() + card.rank);
    }
    /* end of overridden methods */

    /* instance methods */
    public void printCard() {
        System.out.println(this);
    }

    public boolean sameCard(Card card) {
        return this == card; /* trivial because we have compareCard() */
    }

    public int compareCard(Card card) {
        return this.compareTo(card);
    }

    public int findCard(ArrayList<Card> deck) {
        return deck.indexOf(this);
    }
    /* end of instance methods */

    /* class methods */
    public static ArrayList<Card> createDeck() {
        ArrayList<Card> deck = new ArrayList<Card>(52);

        for (Suit s : Suit.values())
            for (int r = 1; r <= 13; ++r)
                deck.add(new Card(s, r));

        return deck;
    }

    public static CardDeck printDeck(CardDeck deck) {
        for (Card c : deck.getDeck()) c.printCard();
        return deck;
    }

    public static CardDeck sortDeck(CardDeck deck) {
        deck.getDeck().sort(null);
        return deck;
    }

    public static CardDeck dealCards(CardDeck deck, int cards) {
        Random random = new Random();
        ArrayList<Card> deal = new ArrayList<Card>(),
                        deckClone = new ArrayList<Card>(deck.getDeck());

        for (int i = 0; i < cards; ++i)
            deal.add(deckClone.remove(random.nextInt(52 - i)));

        return new CardDeck(deal);
    }
    /* end of class methods */
};

class CardDeck {
    ArrayList<Card> deck;

    public CardDeck() {
        deck = Card.createDeck();
    }

    public CardDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public static void main(String args[]) {
        System.out.println("Sorted 52 Card Deck:");
        Card.printDeck(Card.sortDeck(new CardDeck()));
        System.out.println();

        System.out.println("Number of cards to deal?");
        Card.printDeck(Card.dealCards(new CardDeck(),
                                            new Scanner(System.in).nextInt()));
        System.out.println();

        /* illustration of garbage collection */
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memory Used before Garbage Collection: " +
            (runtime.totalMemory() - runtime.freeMemory()) + " bytes");

        System.gc();
        System.out.println("Memory Used after  Garbage Collection: " +
            (runtime.totalMemory() - runtime.freeMemory()) + " bytes");
        /* end of illustration of garbage collection */
    }
};
/* end of CardDeck.java */

/* OUTPUT

Sorted 52 Card Deck:
Ace of SPADES
2 of SPADES
3 of SPADES
4 of SPADES
5 of SPADES
6 of SPADES
7 of SPADES
8 of SPADES
9 of SPADES
10 of SPADES
Jack of SPADES
Queen of SPADES
King of SPADES
Ace of HEARTS
2 of HEARTS
3 of HEARTS
4 of HEARTS
5 of HEARTS
6 of HEARTS
7 of HEARTS
8 of HEARTS
9 of HEARTS
10 of HEARTS
Jack of HEARTS
Queen of HEARTS
King of HEARTS
Ace of DIAMONDS
2 of DIAMONDS
3 of DIAMONDS
4 of DIAMONDS
5 of DIAMONDS
6 of DIAMONDS
7 of DIAMONDS
8 of DIAMONDS
9 of DIAMONDS
10 of DIAMONDS
Jack of DIAMONDS
Queen of DIAMONDS
King of DIAMONDS
Ace of CLUBS
2 of CLUBS
3 of CLUBS
4 of CLUBS
5 of CLUBS
6 of CLUBS
7 of CLUBS
8 of CLUBS
9 of CLUBS
10 of CLUBS
Jack of CLUBS
Queen of CLUBS
King of CLUBS

Number of cards to deal?
5
10 of CLUBS
Jack of CLUBS
2 of SPADES
5 of CLUBS
7 of DIAMONDS

Memory Used before Garbage Collection: 1953464 bytes
Memory Used after  Garbage Collection: 1180968 bytes

*/
