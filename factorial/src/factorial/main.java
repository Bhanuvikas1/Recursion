package factorial;

import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = obj.nextInt();
		
		int ans = fact(n);
		System.out.println("The factorial of "+n+" "+"is"+" "+ans);
		
		
		System.out.println("Enter a number: ");
		int k = obj.nextInt();
		
		int anss = sum(k);
		
		System.out.println("The sum of number is: "+k);
		
		
		
	}
	
	public static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n*fact(n-1);
	}
	
	public static int sum(int k)
	{
		if(k==0)
		{
			return 0;
		}
		return k + sum(k-1);
	}

}
