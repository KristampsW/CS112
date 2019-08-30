import java.util.Scanner;
public class assignment1c
{
	public static void main(String [] args)
	{
		Scanner Input=new Scanner(System.in);
		double amount;
		double remainder;
		int ten,five,one,cents,qua,dime,pen;
		System.out.print("Enter a amount:");
		amount=Input.nextDouble();
		amount*=100;
		ten=((int)amount)/1000;
		remainder=amount-ten*1000;
		five=((int)(remainder))/500;
		remainder=remainder-five*500;
		one=((int)remainder)/100;
		remainder=remainder-one*100;
		cents=((int)remainder)/50;
		remainder=remainder-cents*50;
		qua=((int)remainder)/25;
		remainder=remainder-qua*25;
		dime=((int)remainder)/10;
		remainder=remainder-dime*10;
		pen=(int)remainder;
		System.out.println("$10 ="+ten);
		System.out.println("$5 ="+five);
		System.out.println("$1 ="+one);
		System.out.println("50 cents ="+cents);
		System.out.println("Quarters ="+qua);
		System.out.println("Dime ="+dime);
		System.out.println("Penny ="+pen);
	}
}