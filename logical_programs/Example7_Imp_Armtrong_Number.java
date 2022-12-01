package logical_programs;

public class Example7_Imp_Armtrong_Number 
{
	public static void main(String[] args) 
	{
		int orgnum=153; //1+125+27=153
		int sum=0;
		//		153		0<0	153/10=15/10=1
		for(int i=orgnum; i>0; i=i/10)
		{		
			int rem=i%10; //153%10=3 //15%10=5 //1%10=1
			
			sum=sum+(rem*rem*rem); //27+125+1=153		
		}
	
	
	if(orgnum==sum)
	{
		System.out.println("given number " + orgnum + " is an armstrong number");
	}
	else
	{
		System.out.println("given number " + orgnum + " is not an armstrong number");
	}
}
	
	
	
}
	
	




/*concept 1:
 * To find the last digit of given original number---
 * original num%10
 
//		int rem = OrgNum%10;  // 153%10= 3
//		System.out.println(rem);	  
 */

/*Concept2
 * to remove the last digit of given num
 * originalnun/10
//		OrgNum=OrgNum/10;  //153/10 =15
//		System.out.println(OrgNum);

 */