public class Arrayduplicate
{
	public static void main(String x[])
	{
		int a[]={1,2,3,4,5,6,5,4,3,2,1};
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print(a[i]+",");
			}
		}
	}
}