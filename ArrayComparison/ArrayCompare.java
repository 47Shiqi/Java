package javaPack;

public class ArrayCompare 
{
	//initialize variables
	String[] words = {"high", "every", "nearing", "checking", "food ", "stand", "value", "best", "energy", "add", "grand", "notation", "addition", "food ", "stand"};
	int minLength; //shortest length
	int count = 1; //number of words that have the shortest length
	
	public ArrayCompare()
	{
		Compare();
	}
	
	public String[] Compare()
	{
		minLength = words[0].length(); //Set the length of the first word as the length to be compared with other words
		
		for(int i=1; i<words.length; i++)
		{
			if(words[i].length() == minLength)
			{
				count++; //if this word has the same length as the current shortest word, count up
			}
			else if(words[i].length() < minLength)
			{
				minLength = words[i].length(); //if there is a shorter word, reset the shortest length
				count = 1; //and reset the number of words
			}
		}
		
		String[] wordsMinLen = new String[count]; //create a new array with a size of the number of the shortest words
		
		int index = 0;
		for(int i=0; i<words.length; i++)
		{
			if(words[i].length() == minLength)
			{
				wordsMinLen[index] = words[i]; //add each word to the array
				index++;
			}
		}
		return wordsMinLen;
	}
}
