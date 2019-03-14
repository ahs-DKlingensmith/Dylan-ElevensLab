/*
 * Card class
 */


public class Card {
    
    //Establish attributes
    private String rank;
    private String suit;
    private int value;
    
    //Default Card constructor
    public Card()   {
        
    }
    
    //The Card constructor accepts arguments for each attribute
    public Card(String r, String s, int v)    {
        
        rank = r;
        suit = s;
        value = v;
        
    }
    
    //The getRank method returns the data in the object's rank field
    public String getRank() {
        
        return rank;
        
    }
    
    //The getSuit method returns the data in the object's suit field
    public String getSuit() {
        
        return suit;
        
    }
    
    //The getValue method returns the data in the object's value field
    public int getValue()   {
        
        return value;
        
    }
    
    
    //The toString method returns a string that prints the rank, suit, and
    //value of the card
    @Override
    public String toString()    {
        
        return rank + " of " + suit + " (Point Value = " + value + ")";
        
    }
}
