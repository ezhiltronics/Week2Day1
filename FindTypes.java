package week2.day1;

public class FindTypes {
	
public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0,space = 0,digit = 0, specialChar = 0;
		 
		char[] charArr=test.toCharArray();
		
		for(int i=0;i<charArr.length;i++)
		{
			if(Character.isLetter(charArr[i]))
			{
				letter++;
			}
			else if (Character.isSpaceChar(charArr[i]))
			{
				space++;
			}
			else if(Character.isDigit(charArr[i]))
			{
				digit++;
			}
			else
			{
				specialChar++;
			}
		}
		System.out.println("The Sentence is "+test);
		System.out.println("The number of letters in the sentence is: "+letter);
		System.out.println("The number of spaces in the sentence: "+space);
		System.out.println("The number of numbers in the sentence : "+digit);
		System.out.println("The number of special characters in the sentence : "+specialChar);
	}


}
