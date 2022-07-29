import java.util.*;
public class LIS {
	public static void main(String[] args) 
	{
		
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("enter the count of total  number of elements in list. ");
			int n=sc.nextInt();
			int []arr = new int[n];
			System.out.println("enter the elements of list. ");
			for (int i =0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int max_lis=0;
			int max_lis_ind=0;
			for(int i=0;i<n;i++)
			{   int c=1;
			int cm=arr[i];
				for(int j=i;j<n;j++)
				{
					if(arr[j]>cm)
					{
						cm=arr[j];
						c++;
					}
					
				}
				if(c>max_lis)
				{
					max_lis=c;
					max_lis_ind=i;
				}
			}
			System.out.print("longest increasing subsequence:- ");
			int cm=arr[max_lis_ind];
			for(int  i=max_lis_ind; i<n;i++)
			{    
				if(arr[i]>cm)
				{
					System.out.print(cm+" ");
					cm=arr[i];
				}
			}
			System.out.print(cm+" ");
		}
		
		
	}
}
