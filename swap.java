package recursion;

import java.util.Arrays;

public class swap {

	public static void main(String[] args) {
		
		int[]arr = {1,2,3,4,5,6,7,8};
		
		swapping(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	
	static void swapping(int[] arr, int start,int end)
	{
		if(start>end)
		{
			return;
		}
		
		int temp;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		swapping(arr,start+1,end-1);
		
	}

}
