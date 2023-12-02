package minChange;

import java.util.ArrayList;

public class minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,5,10,20,50,100};
		
		int amount = 345;
//		
//		for(int i = arr.length-1; i>=0;i--)
//		{
//			while(amount>=arr[i])
//			{
//				amount = amount-arr[i];
//				System.out.print(arr[i]+",");
//			}
//		}
		int index = arr.length-1;
		
		
		
		change(arr,amount,index);
		
		System.out.println();
		
		ArrayList<Integer>ans = change1(arr,amount,index,new ArrayList());
		System.out.println(ans);
		

	}
	
	public static void change(int[] arr,int amount,int index)
	{
		if(amount==0)
		{
			return;
		}
		if(amount>=arr[index])
		{
			System.out.print(arr[index]+",");
			amount= amount-arr[index];
		}
		else {
			index--;
		}
		change(arr,amount,index);
	}
	
	public static ArrayList<Integer> change1(int[] arr,int amount,int index,ArrayList<Integer>list)
	{
		if(amount==0)
		{
			return list;
		}
		if(amount>=arr[index])
		{
			list.add(arr[index]);
			amount-=arr[index];
		}
		else {
			index--;
		}
		return change1(arr,amount,index,list);
	}
}
