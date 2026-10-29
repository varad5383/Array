import java.util.*;
public class  Calculatesumofarrayissize5
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int sum=0;
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
        sum+=a[i];
		System.out.print(a[i]+",");
		}
		System.out.println(sum);
	}
}