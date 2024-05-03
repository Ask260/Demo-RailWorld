public class secondlargest
{
	public static void main(String[] args) 
	{
		
		int[] arr={3,4,6,7,8,8};
		int largest=helper(arr);

		int secondlargest=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<largest){
				secondlargest=Math.max(secondlargest,arr[i]);
			}
		}

		System.out.println(secondlargest);int ans= secondlargest;
		
	}

	public static int helper(int[] arr){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return max;
	}
	
}