public class Missing
{
	public static void main(String x[])
	{
		int a[]={1,2,3,5};
		int j=1;
		for(int i=0;i<4;i++)
		{
			if(j!=a[i])
			{
				System.out.println(j);
				i--;
			}
			j++;
		}
	}
}
	
			
				
