package Assignment;

public class Selectionsort {

	public static void main(String[] args) {
		
		int[] arr= {2,4,5,3,10,1,9}; //Selection Sort
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			int reali=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[reali]) //extracting least value from sub array
				{
					reali=j;//here reali is lowest eleemnt index
					
				}
			}
			temp=arr[reali];//here we are assigning the least value of subarray to temp
			arr[reali]=arr[i]; // assigning array i value to reali indexed value
			arr[i]=temp; // reali value to i indexed array
			
		}
		for(int i:arr)
		{
			System.out.println(i);
		}

	}

}
