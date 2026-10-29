public class GeneratetheFibonacciseriesuptonterms
{
	public static void main(String x[])
	{
		int a=0;
		int b=1;
		for(int i=0;i<5;i++)
		{
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}
	}
}