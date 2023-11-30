package checksortedornot;

public class main {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,5,8,20};
		
		boolean ans =check(arr,0);
		if(ans==true) {
			System.out.println("The given array is sorted");
		}
		else {
			System.out.println("The given array is not sorted");
		}
		

	}
	
	public static boolean check(int[] arr,int index)
	{
		if(index==arr.length-1)
		{
			return true;
		}
		return arr[index]<arr[index+1]&& check(arr,index+1);
	}
	
}
