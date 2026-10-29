public class Maximumandminimumnumberinarray
{
	public static void main(String x[])
	{
		int a[]={23,54,76,87,34,90,56,24,95};
		int min,max;
		min=a[0];
		max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max="+max+"\nmin="+min);
	}
}