public class  CountNumberofEvenandOddElements
{
	public static void main(String x[])
	{
		int a[]={1,2,3,4,5,6};
		int ecount=0,ocount=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				ecount++;
			}
			else
			{
				ocount++;
			}
		}
		System.out.println("odd num="+ocount+"\neven num="+ecount);
	}
}
