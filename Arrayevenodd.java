public class Arrayevenodd
{
	public static void main(String x[])
	{
		int a[]={1,2,3,4,5,6};
		int e=0,o=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				e++;
			}
			else
			{
				o++;
			}
		}
		int even[]=new int[e];
		int odd[]=new int[o];
		int v=0;
		int w=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[j]%2==0)
			{
			even[v++]=a[j];
			}
			else
			{
				odd[w++]=a[j];
			}
		}
		System.out.println("even element");
		for(int i=0;i<e;i++)
		{
			System.out.print(even[i]+",");
		}
		System.out.println();
		System.out.println("odd element");
		for(int i=0;i<o;i++)
		{
			System.out.print(odd[i]+",");
		}
	}
}