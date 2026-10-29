public class maximumrepeatingnumberinagivenarray
{
	public static void main(String x[])
	{
		int a[]={1,2,3,4,5,5,5,4,4,3,3,2,1,5,6,6,6,6,6,6,6,6,6,6,6,6,6,5};
		int b=0;
		int count2=0;
		int max;
		for(int i=0;i<a.length;i++)
		{int count1=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				count1++;
				}
			
			}
			if(count1>count2)
			{
				count2=count1;
				b=a[i];
			}
		}
		System.out.println(b);
		System.out.println(count2);
	}
}