public class  countalldistinctpairsforaspecificdifference
{
	public static void main(String x[])
	{
		int a[]={1,2,3,4,5,6,8,10,12};
		int k=2;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]-a[j]==Math.abs(k))
				{
				System.out.println(a[i]+","+a[j]);
				}
			}
		}
	}
}