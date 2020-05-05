package Question;
import java.math.*;
public class Array_diagonal_difference {
	public static void main(String args[])
	{
		int a[][]= {
				{11,2,4},
				{4,5,6},
				{10,8,-12}};
		int left=0;
		int rigth=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
				
		}
		for(int i=0;i<a.length;i++)
		{
			for( int j=0;j<=a.length;j++)
			{
				left +=a[i][j+i];
				rigth +=a[i][2-i];
		       break;}
		}
	
	System.out.println(Math.abs(left-rigth));
	}

}
