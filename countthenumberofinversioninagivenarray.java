public class countthenumberofinversioninagivenarray
{
	public static void main(String x[])
	{
		int a[]={1,9,6,4,5};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				System.out.println(a[i]+","+a[j]);
				count++;
				}
			}
		}
		System.out.println("no.of pair= "+count);
	}
}