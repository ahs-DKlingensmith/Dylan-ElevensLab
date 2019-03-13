Dylan Klingensmith
Period 2
3/12/19
Activity 3 Questions

1. import java.util.Random;

	public static String flipCoin	{
	
		Random randomizer = new Random();
		String flip;
		int odds;
		
		odds = randomizer.nextInt(3) + 1;
		
		if(odds == 1 || odds == 2)	{
		
			flip = "heads";
			
		} else {
		
			flip = "tails";
			
		}
		
		return flip;
	
	}
	
2. public static boolean arePermutations(int[] array1, int[] array2)	{
		
		boolean permutation = true;
		
		if (array1.length == array2.length)	{
		
			for (int x = 0; x < array1.length; x++)	{
			
				if (array2.indexOf(array1[x]) == -1)	{
				
					permutation = false;
					
				}
			
			}
			
			return permutation;
			
		} else {
			
			return false;
		
		}
		
}

3. The random integers to return the sequence are 4, 3, 3, and 4.
.		