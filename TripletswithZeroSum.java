public class  TripletswithZeroSum
{
	public static void main(String x[])
	{
		int a[]={-1, 0, 1, 2, -1, -4};
		int n=a.length;
		boolean flag=false;
		
		for(int i=0;i<n-2;i++)
		{
			for(int j=i;j<n-1;j++)
			{
				for(int k=j;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.println(a[i]+","+a[j]+","+a[k]);
						flag=true;
					}
				}
			}
		}
		if(!flag)
		{
			System.out.println("triplet not found");
		}
	}
}
			