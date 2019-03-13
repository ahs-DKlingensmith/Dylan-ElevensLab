/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
       
	public static void main(String[] args) {
            
            //Establish three Deck objects
            String[] deckRanks =  new String[3];
            deckRanks[0] = "Two";
            deckRanks[1] = "Three";
            deckRanks[2] = "Four";
            
            String[] deckSuits = new String[2];
            deckSuits[0] = "Spades";
            deckSuits[1] = "Hearts";
            
            int[] deckValues = new int[3];
            deckValues[0] = 2;
            deckValues[1] = 3;
            deckValues[2] = 4;
            
            Deck deck1 = new Deck(deckRanks, deckSuits, deckValues);
            
            //Print the size of the deck
            System.out.println("The deck has " + deck1.size() + " cards.");
        
	}
}
