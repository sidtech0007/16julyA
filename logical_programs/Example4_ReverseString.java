package logical_programs;

public class Example4_ReverseString 
{
	public static void main(String[] args) 
	{
		String org="ABCD";
		
		String rev="";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
		}
		
		System.out.println(rev);
			
	}

}
