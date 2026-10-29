import java.util.*;
public class Arraysearch1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int search=5;
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean flag=false;
		for(int i=0;i<5;i++)
		{
			if(a[i]==search)
			{
				
			flag=true;
			break;
			}
		}
			if(flag)
			{
				System.out.println(search+" is found");
			}
			else
			{
				System.out.println(search+" is not found");
			}
			
		
	}
}
		