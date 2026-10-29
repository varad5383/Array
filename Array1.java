import java.util.*;
public class Array1
{
	public static void main (String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of element");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+",");
		}
	}
}