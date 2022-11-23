package Assignment;
//import java.util.Arrays;
import java.util.Scanner;

public class Quicksort {

	public static void main(String[] args) {
		//int[] arr= {92,34,45,12,10,67,34,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of elements in the array");

		int n=sc.nextInt();
		System.out.println("enter the elements:4");

		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

	    
		System.out.println("THE ORIGINAL ARRAY IS:");
		sc.close();
		
		
		for(int i:arr)            // unsorted array
		{
			System.out.println(i);
		}
		
		
		quicksort(arr,0,arr.length-1);  // calling quicksort method
		System.out.println("THE SORTED  ARRAY ELEMENTS ARE:");
		for(int i:arr)             // sorted Array
		{
			System.out.println(	i);
		}
		

	}
	private static void quicksort(int[] arr,int less, int more)
	{
		if (less>= more) {
		      return;
		    }
		int pivot=arr[more];

		int low=less;
		int high=more;

		while(low<high)
		{
			while(arr[low]<=pivot && low<high)
			{
				low++;
			}
			while(arr[high]>=pivot && low<high)
			{
				high--;
			}
			swap(arr,low,high); // swaps low and high elements
			
		}
		swap(arr,low,more);    // swaps pivot element
		quicksort(arr, less,low-1); // calling recursive quicksort left side of pivot
		quicksort(arr,high+1,more);  //// calling recursive quicksort right side of pivot
	}
	private static void swap(int[] arr,int index1,int index2)
	{
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
	
}
