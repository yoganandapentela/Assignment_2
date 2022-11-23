package Assignment;

public class Assignment2_1 {

	public static void main(String[] args) {
		//int[] arr={2,4,6,2,8,4,2,3,5,3};
		 int [] arr = new int [] {1, 2,3, 4, 2, 7, 8, 8, 3};   
		for(int i=0;i<arr.length-1;i++)
		{
		    for(int j=i;j<arr.length-1;j++)
		    {
		        if(arr[i] == arr[j+1])  
		        {
		             System.out.println(arr[j+1]);  

		        }
	                     
		    }

	}
	}}

