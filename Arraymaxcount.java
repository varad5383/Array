public class Arraymaxcount
{
	public static void main(String x[])
	{
		int a[]={1,2,3,4,5,5};
		boolean visited[]=new boolean[a.length];
		int max=0;
		int major=-1;
		for(int i=0;i<a.length;i++)
		{
			if(visited[i])
			{
				continue;
			}
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					visited[j]=true;
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				major=a[i];
			}
		}
		System.out.println("max count is "+max+" of "+major);
	}
}
					