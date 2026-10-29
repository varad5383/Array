public class AllPairswithDifferencek
{
	public static void main(String x[])
	{
		int a[]={1, 5, 3, 4, 2};
		int n=a.length;
		boolean flag=false;
		int k=2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j&&Math.abs(a[i]-a[j])==k)
				{
					System.out.println(a[i]+","+a[j]);
					flag=true;
				}
			}
		}
		if(!flag)
		{
			System.out.println("pair not found ");
		}
	}
}