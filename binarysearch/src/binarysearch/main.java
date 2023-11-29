package binarysearch;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,5,7,9,11,14,55,79,50};
		int n = a.length;
		int x = search(a,n,11);
		
		if(x==-1)
		{
			System.out.println("the key value is not present in the array");
		}
		else {
		System.out.println("The key element is in the index: "+x);
		}
	}
	
	public static int search(int[]a,int n,int key )
	{
		int low = 0;
		int high = n-1;
		int mid;
		
		while(low<=high)
		{
			mid = (low+high)/2;
			if(key==a[mid])
			{
				return mid;
			}
			if(key>a[mid])
			{
				low = mid+1;
			}
			else {
			high = mid-1;
			}
		}
		return -1;
	}

}
