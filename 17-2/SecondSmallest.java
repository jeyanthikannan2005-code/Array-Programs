import java.util.Scanner;
class SecondSmallest
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
		int min=ar[0];
		int second_min=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println("The minimum value is "+min);
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<second_min && ar[i]!=min)
			{
				second_min=ar[i];
			}
		}
		System.out.println("The Second minimum value is "+second_min);
	}
}
		