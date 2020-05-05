import java.security.PublicKey;
import java.util.Scanner;
public class Firstpattern {
	
public static void main(String []args)
{
 
	Scanner in=new Scanner(System.in);
	System.out.println("enter your number");
int n=in.nextInt();
	
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<i;j++)
			System.out.print("* ");
		
		System.out.println();
	}
 
	}
}
