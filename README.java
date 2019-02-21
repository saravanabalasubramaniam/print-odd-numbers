import java.io.*;
import java.util.*;
class Printoddnumbers
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int number,remainder,rev=0;
	number=input.nextInt();
	while(number!=0)
	{
		remainder=number%10;
		rev=(rev*10)+remainder;
		number=number/10;
	}
	number=rev;
	while(number!=0)
	{
		remainder=number%10;
		if(remainder%2!=0)
		{
		System.out.print(remainder);
		System.out.print(" ");
		}
		number=number/10;
	}
  }
}
	
