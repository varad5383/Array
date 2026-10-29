public class Mergetwoarrayanddisplayit
{
	public static void main(String x[])
	{
		int a[]={1,2,3,4,5};
		int b[]={6,7,8,9};
		int c[]=new int[a.length+b.length];
		int v=0;
		for(int i=0;i<a.length;i++)
		{
			c[v++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[v++]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+",");
		}
	}
}