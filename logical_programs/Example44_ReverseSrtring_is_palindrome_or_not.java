package logical_programs;

public class Example44_ReverseSrtring_is_palindrome_or_not 
{
	public static void main(String[] args) 
	{
		String org="sis";
		
		String rev="";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
		}
		
		System.out.println(rev);
		
		System.out.println("===Find given Strinf is palidrome or not===");
	
		if(org.equals(rev))
		{
			System.out.println("Given String is palidrome");
		}
		else
		{
			System.out.println("Given String is not a palidrome");
		}
	}

}
