package Assignment;

public class Subarray {
	public static boolean findsubarray(int[] arr1,int[] arr2,int n,int m) {
		int sum=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr2[i]==arr1[j])
				{
					sum=sum+1;
					break;
				}
			}
			
		}
		
		if(sum==m)
		{
			return true;
		}
		else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		int[] arr1= {2,4,5,7,1,8,9};
		int[] arr2= {2,1,6};
		int m=arr2.length;
		int n=arr1.length;
		
		if(findsubarray(arr1,arr2,n,m))
		{
			System.out.println("Array2 is the subarray of array1");
		}
		
		else
		{
			System.out.println("Array2 is the  not subarray of array1");

		}



	}

}
