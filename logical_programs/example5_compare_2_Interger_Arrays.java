package logical_programs;

import java.util.Arrays;

public class example5_compare_2_Interger_Arrays 
{
	public static void main(String[] args) 
	{
		int ar1[]= {30,60,90};
		int ar2[]= {20,40,60};
		int ar3[]= {20,40,60};
		
		System.out.println(Arrays.equals(ar1, ar2));   //false
		System.out.println(Arrays.equals(ar1, ar3));	//false
		System.out.println(Arrays.equals(ar2, ar1));	//false
		System.out.println(Arrays.equals(ar2, ar3));	//true
		
			
	}

}
