package findElement;

public class main {

	public static void main(String[] args) {
		int[] arr = {1,3,4,6,10,23};
		int target = 6;
		int ans = find(arr,target,0);
		
		System.out.println(ans);
	}

	
	public static int find(int[] arr,int target,int index)
	{
		if(index==arr.length)
		{
			return -1;
		}
		if(arr[index]==target)
		{
			return index;
		}
		else {
			return find(arr,target,index+1);	
		}
	}
}
