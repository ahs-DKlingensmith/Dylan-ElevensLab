Dylan Klingensmith
Period 2
3/19/19
Activity 7 Questions

1. A deck of 52 playing cards
		private Deck cardDeck;
		private int deckSize;
		private int boardSize;
		
		private int cardValue;
		private int cardRank;
		
		
		
2. - Shuffle the deck of 52 cards
   - Deal 9 cards face-up
   - Determine if there are any possible pairs or triplets that can be removed
		- If not, end the game with a loss
   - The player chooses a pair or triplet to remove
   - Remove the cards from the board and replace with new face-up cards from the deck
   - Repeat until loss or the entire deck is dealt and all cards are removed
   
3. Seems to be so

4a. The dealMyCards method is found when a new ElevensBoard object is declared and when the newGame method is called

4b. The replaceSelectedCards method, isLegal, and anotherPlayIsPossible methods should call the methods.

4c. Index - 0, 1, 2, 3, 4
   Number - 0, 1, 3, 6, 7
   
4d. 