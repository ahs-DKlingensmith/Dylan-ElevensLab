import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/*
* Deck class
*/
public class Deck {

	
	private ArrayList <Card> cards = new ArrayList();
	private int size;


	//The Deck constructor accepts arguments of an array for each card 
        //attribute and adds cards to the deck for each combination
        //Then, the deck is shuffled, randomizing the order of the cards
	public Deck(String[] ranks, String[] suits, int[] values) {
		
            for (int x = 0; x < ranks.length; x++) {
                
                for (String y: suits)  {       
                        
                        cards.add(new Card(ranks[x], y, values[x]));
                      
                }
                
            }
            
            shuffle();
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

	//The shuffle method shuffles the Card objects in the cards array
        //and resets the size of the deck
	public void shuffle() {
		
            Random randomizer = new Random();
            Card holdCard;
            
            for (int x = cards.size() - 1; x > 0; x--)  {
                
                int r = randomizer.nextInt(x);
                
                holdCard = cards.get(x);
                cards.set(x, cards.get(r));
                cards.set(r, holdCard);
                
            }
            
	}

	
	public Card deal() {
		
            if (isEmpty())  {
                
                return null;
                
            } else {
                
                size--;          
                return cards.get(size);
            
            }
            
            
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
