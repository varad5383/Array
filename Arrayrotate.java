public class Arrayrotate
{
	public static void main(String x[])
	{
		int a[]={1,2,3,4,5,6,7,8,9};
		int pos=4;
		for(int i=pos;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		for(int i=0;i<pos;i++)
		{
			System.out.print(a[i]+",");
		}
	}
}
