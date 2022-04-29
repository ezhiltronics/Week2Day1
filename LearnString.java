package week2.day1;

public class LearnString {
	
	public static void main(String[] args) {
		
		String txt1="testleaf";
		int l=0;
		char[] array= txt1.toCharArray();
		for ( int i=0; i<array.length;i++)
		{
			if (array[i]=='e')
			{
				l=l+1;
			}
		}
		System.out.println("e" + l);
		
		String txt2= "Testleaf is situated in twin towers teynampet";
		String[] split=txt2.split(" ");
		System.out.println("words starts with t or T ");
		for (int i = 0; i<split.length;i++)
		{
			if(split[i].startsWith("t")|| split[i].startsWith("T"))
			{
				System.out.println(split[i]);
			}
		}
		
	}

}
