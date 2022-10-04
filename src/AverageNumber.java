import java.util.Scanner;


public class AverageNumber 
{
	public static void main(String[]a)
	{
		Scanner sc=new Scanner(System.in);
			int i,s,last,sum=0,countNum=0;
			float average;
		
				
	System.out.println("Enter the first no of range:");
	s=sc.nextInt();
		
	System.out.println("Enter the second no of range:");
	last=sc.nextInt();
	
	for(i=s;i<=last;i++)
	{
		sum+=i;
		countNum++;
	}
	
	average= (float)sum/countNum;
	System.out.println("The average is:"+average);
	
 }
}	
