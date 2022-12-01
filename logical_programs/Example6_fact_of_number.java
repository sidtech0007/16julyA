package logical_programs;

import java.util.Scanner;

public class Example6_fact_of_number 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("eneter number:");
		int num = s1.nextInt();  // 4
		
		int fact=1;
		
				//4		1>1 
		for(int i=num; i>=1; i--)
		{
			//1=1*4
			fact=fact*i;
			
			//4 
			//4*3=12
			//12*2=24
			//24*1=24
			//0>1    fro loop break
			
		}
		
		System.out.println(fact);
		
	}

}
