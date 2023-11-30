package zero;

public class main {

	public static void main(String[] args) {
		
		int ans = counter(2000002,0);
		
		System.out.println(ans);

	}
	
	public static int counter(int n, int count)
	{
		if(n==0)
		{
			return count;
		}
		int rem = n%10;
		if(rem==0)
		{
			return counter(n/10,count+1);
		}
		return counter(n/10,count);
	}

}
