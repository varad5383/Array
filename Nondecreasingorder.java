public class Nondecreasingorder
{
	public static void main(String x[])
	{
		int a[]={1,2,3,4};
		int n=a.length;
		boolean flag=true;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]>a[i+1])
			{
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println("in decending");
		}
		else
		{
			System.out.println("not in decending");
		}
	}
}