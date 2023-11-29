package binarysearch;

import java.util.Scanner;

public class recursion {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int[] arr = {1,2,3,55,66,77,88,99};
		System.out.print("Enter target element: ");
		int target = obj.nextInt();
		int result = Bsearch(arr,0,arr.length-1,target);
		
		if(result == -1)
		{
			System.out.println("Target element is not in the array");
		}
		else {
			System.out.println("The target element is in the index : "+result);
		}
		
		

	}
	
	public static int Bsearch(int[] arr,int first, int last, int target) {
		if(first>last)
		{
			return -1;
		}
		else {
			int mid = (first+last)/2;
			
			if(arr[mid] == target)
			{
				return mid;
			}
			if(target<arr[mid])
			{
				return Bsearch(arr,first,mid-1,target);
			}
			return Bsearch(arr,mid+1,last,target);
		}
	}

}
