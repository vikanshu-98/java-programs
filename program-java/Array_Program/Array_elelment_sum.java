package Question;
import java.util.*;
public class Array_elelment_sum {

	public static void main(String[] args) {
	  Scanner in =new Scanner(System.in);
	  System.out.println("enter the size of array");
	  int i=in.nextInt();
	  int  a[]=new int[i];
	  for(int j=0;j<a.length;j++)
	  {
		  System.out.println("enter the element into aray");
		  a[j]=in.nextInt();
	  }
	 
int result=sum(a);

System.out.println(result);
	}
	public static  int sum(int a[])
	{
		int sum=0;
		for(int j:a)
	      sum+=j;
	      return sum;
		}
	}


