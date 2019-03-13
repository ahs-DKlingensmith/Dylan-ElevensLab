import java.util.List;
import java.util.ArrayList;

/*
* Deck class
*/
public class Deck {

	
	private List<Card> cards;
	private int size;


	//The Deck constructor accepts arguments of an array for each card 
        //attribute and adds cards to the deck for each combination
        //Then, the deck is shuffled, randomizing the order of the cards
	public Deck(String[] ranks, String[] suits, int[] values) {
		
            for (int x = 0; x < ranks.length; x++) {
                
                for (int y = 0; y < suits.length; y++)  {       
                        
                        Card newCard = new Card(ranks[x], suits[y], values[x]);
                        cards.add(newCard);
                      
                }
                
            }
            
            size = cards.size();
            
	}


	//The isEmpty method returns true if the cards array has zero 
        //elements; otherwise, it returns false
	public boolean isEmpty() {
		
            if (cards.size() == 0)  {
                
                return true;
                
            } else {
                
                return false;
                
            }
            
	}

	
	public int size() {
            
            return cards.size();
            
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
	}

	
	public Card deal() {
		
            --size;          
            return cards.get(size);
            
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
