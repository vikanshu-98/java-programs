
import java.util.*;
public class Array1 {

	 
	    public static void main(String args[])
	{
	 Scanner in=new Scanner(System.in);
	int count_1=0;
	int count_2=0;
	 
	 
	int a[]=new int[3];
	int b[]=new int[3];
	 
	    for(int i=0;i<3;i++)
	    {System.out.print("enter for first array");
	        int inn=in.nextInt();
	        a[i]=inn;}
	    for(int i=0;i<3;i++) {
	        System.out.print ("enter for second aray");
	        
	        b[i]=in.nextInt();
	    }
	    
	for(int i=0;i<3;i++)
	{
	    if(a[i]>b[i]) 
	    {count_1=count_1+1;}
	    if(a[i]<b[i]) {
	 count_2=count_2+1;
	         }}
	System.out.print(count_1+" "+count_2);
	}
	   
	}
 
