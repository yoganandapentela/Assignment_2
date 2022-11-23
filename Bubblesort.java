package Assignment;
public class Bubblesort {

	public static void main(String[] args) {
		int [] arr= {2,5,3,1,6,7,8,4};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k:arr)
		{
			System.out.println(k);
		}

	}

}
