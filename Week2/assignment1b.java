import java.util.Scanner;
public class assignment1b
{
	public static void main(String [] args)
	{
		Scanner Input=new Scanner(System.in);
		double p;
		short f=10000;
		double r=0.0299;
		byte n=10;
		p=f/Math.pow((1+r),n);
		
		System.out.println("Deposit money today="+p);
	}
}