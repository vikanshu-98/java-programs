
public class Selection{
public static void main(String args[])
{
	int a[]= {5,2,-1,6,3};
	for(int i=0;i<a.length;i++)
		{
		for(int j=i;j<a.length;j++)
		{
			if(a[i]>a[j])
			{int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
						
			}
		}
		}
	for(int temp:a)
		System.out.println(temp);
	
}

}
