public class Palindromeornot
{
	public static void main(String x[])
	{
		int a[]={1,2,3,2,1};
		int start=0;
		int end=a.length-1;
		boolean flag=false;
		while(start<end)
		{
			
		 if(a[start]==a[end])
		 {
			 flag=true;
		 }
		 
		 start++;
		 end--;
		}
		if(flag)
		{
			System.out.println("it is palindrome");
		}
		else
		 {
			 System.out.println("it is not palindrome");
		 }
		
	}
}
		 