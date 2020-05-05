import java.util.Scanner;
public class Thirdpattern {
public static void main(String []args)
{
	  int a[]= {5,4,-3,-1,-2,};
	  boolean condition =false;
    for(int i=1;i<=5;i++)
    {
    	
    	int sum=0;
    	for(int j=i;j<=5;j++)
    	{
    		sum+=a[j];
       		if(sum==0) {
       	     condition= true;
       	     break;
       			
       		}
    	 
    	}
    	if(condition) {
    		System.out.println("condition true");
    		break;
    	}
    	else {
    		System.out.println("condition false");
    	}
    	
    }


}
}