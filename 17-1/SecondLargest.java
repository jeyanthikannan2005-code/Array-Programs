import java.util.Scanner;
class SecondLargest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array :");
		int size=sc.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("Enter the "+(i+1)+" value :");
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
			
		}
		System.out.println();
		int max=0;
		int second_max=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println("The maximum value is "+max);
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>second_max && ar[i]!=max)
			{
				second_max=ar[i];
			}
		}
		System.out.println("The Second maximum value is "+second_max);
	}
}
		