public class Arraysmallmissing
{
	public static void main(String x[])
	{
		int a[]={1,3,4,5,7};
		int n=7;
		int j=1;
		int miss=Integer.MAX_VALUE;
		int min=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=j)
			{
				min=j;
				i--;
			}
			j++;
			if(min<miss)
			{
				miss=min;
			}
		}
		System.out.println("lessmising num is "+miss);
	}
}
				
				
			