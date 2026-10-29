public class MissingNumberin1toN
{
	public static void main(String x[])
	{
		int a[]={1,2,4,6};
		int n=6;
		int j=1;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=j)
			{
				System.out.println(j);
			
				i--;
			}
			
				
				j++;
			
		}
	}
}

