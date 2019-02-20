import java.io.*;
import java.util.*;
class Printoddnumbers
{
  public static void main(String args[])
  {
 	Scanner input=new Scanner(System.in);
	String a=input.nextLine();
	for(int i=0;i<a.length();i++)
	{
		if(a.charAt(i)%2!=0)
		{
			System.out.print(a.charAt(i));
			System.out.print(" ");
		}
	}
  }
}
	
	
