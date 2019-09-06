import java.util.Scanner;
public class assignment2
{
	public static void main(String [] args)
	{
		Scanner Input=new Scanner(System.in);
		double n;
		double r;
		double guess;
		
		System.out.print("Enter a number:");
		n=Input.nextDouble();
		guess= n/2;
		for(int time =0;time<5;time+=1)
		{
			r=n/guess;
			guess= (guess+r)/2;
			
			
		}
		System.out.printf("%6.2f",guess);
	}
}