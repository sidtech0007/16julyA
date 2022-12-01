package logical_programs;

import java.util.Scanner;

public class example_AcceptInputFromUser 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("enter num 1");
		int num1 = s1.nextInt();
		
		System.out.println("enter num 2");
		int num2 = s1.nextInt();
		
		System.out.println("Multiplication of num1 & num2: " + num1*num2);
		
	}
}
