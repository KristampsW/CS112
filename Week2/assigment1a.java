import java.util.Scanner;
public class assigment1a
{
	public static void main(String [] args)
	{
		Scanner Input=new Scanner(System.in);
		int number;
		int mins, hours, seconds;
		System.out.print("Enter seconds number:");
		number=Input.nextInt();
		hours=(number%86400)/3600;
		mins=((number%86400)%3600)/60;
		seconds=((number%86400)%3600)%60;
		
		System.out.println("Hours="+hours);
		System.out.println("Minutes="+mins);
		System.out.println("Seconds="+seconds);
	}
}