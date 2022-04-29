package week2.day1;

public class Palindrome {
	
	public static void main(String[] args) {
        // Value assigned
		String str = "madam";
		String rev="";
		
		for(int i=(str.length())-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
		System.out.println("The given word "+str+" is a Palindrome.");
		else
		System.out.println("The given word "+str+" is not a Palindrome.");
	}

}
