public class Addelement
{
	public static void main(String x[])
	{
		int a[]={1,2,3,4,5};
		int pos=3;
		int num=200;
		for(int i=a.length;i>=pos;i++)
		{
			a[i]=a[i-1];
		}
		a[pos]=num;
		for(int i=0;i<=a.lenght;i++)
		{
			System.out.print(a[i]+",'+");
		}
	}
}
		
		