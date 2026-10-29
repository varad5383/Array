public class  Positiveandnegativenumberinarray
{
	public static void main(String x[])
	{
		int a[]={2,4,-5,-9,5,0,4,1,6};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				System.out.println("positive num="+a[i]);
			}
			else if(a[i]<0)
			{
				System.out.println("negative num="+a[i]);
			}
			else
			{
				System.out.println("zero num="+a[i]);
			}
		}
	}
}