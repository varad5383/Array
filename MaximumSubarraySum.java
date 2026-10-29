public class MaximumSubarraySum
{
	public static void main(String x[])
	{
		int a[]={-2,1,-3,4,-1,2,1,-5,4};
		int n=a.length;
		int maxsum=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int currentsum=0;
				for(int k=i;k<=j;k++)
				{
					currentsum+=a[k];
				}
				if(currentsum>maxsum)
				{
					maxsum=currentsum;
				}
			}
		}
		System.out.println("maxsum of subarray="+maxsum);
	}
}