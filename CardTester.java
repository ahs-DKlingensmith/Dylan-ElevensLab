/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	public static void main(String[] args) {
		
            //Create three Card objects
            Card threeOfHearts = new Card("Three", "Hearts", 3);
            Card sixOfSpades = new Card("Six", "Spades", 6);
            Card alsoSixOfSpades = new Card("Six", "Spades", 6);
            
            //Test the accessor methods for each field and the toString method
            System.out.println(threeOfHearts.getRank() 
                + threeOfHearts.getSuit() + threeOfHearts.getValue());
            System.out.println(sixOfSpades.getRank() 
                + sixOfSpades.getSuit() + sixOfSpades.getValue());
            System.out.println(alsoSixOfSpades.getRank() 
                + alsoSixOfSpades.getSuit() + alsoSixOfSpades.getValue());
            
            System.out.println(threeOfHearts.toString());
            System.out.println(sixOfSpades.toString());
            System.out.println(alsoSixOfSpades.toString());
              
            
	}
        
        //The compareCards method compares two Card objects and returns
        //true if their ranks, suits, and values are equal
        public static boolean compareCards(Card card1, Card card2)  {
            
            if (card1.getRank().equals(card2.getRank())
                    && card1.getSuit().equals(card2.getSuit())
                    && card1.getValue() == card2.getValue())    {
                
                return true;
                
            } else {
                
                return false;
            }
            
        }
        
        
        
        
}
