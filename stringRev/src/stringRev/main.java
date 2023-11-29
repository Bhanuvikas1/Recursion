package stringRev;

public class main {

	public static void main(String[] args) {
		String ans = rev("bhanu");
		System.out.println(ans);

	}
	
	public static String rev(String word)
	{
		if(word==null || word.length()<1)
		{
			return word;
		}
		return rev(word.substring(1))+word.charAt(0);
	}

}
