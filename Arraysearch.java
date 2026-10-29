public class Arraysearch
{
	public static void main(String x[])
	{
		int a[]={1,2,3,4,5};
		int k=2;
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				System.out.println("found element at "+i+"th place");
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("element not found");
		}
	}
}

			