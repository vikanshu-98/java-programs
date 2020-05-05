import java.util.Scanner;
public class Secoondpattern {
public static void main(String []args)
{
	Scanner in=new Scanner(System.in);
	System.out.println("enterthe number");
	int  n=in.nextInt();
	System.out.println("* ");
for(int j=1;j<=n-2;j++)
{
	System.out.print("* ");
	for(int i=1;i<=j-1;i++) {
		System.out.print("  ");
}
	
System.out.print("* ");
System.out.println();
	}
		for(int j=1;j<=n;j++)
			System.out.print("* ");
		 
}
}
