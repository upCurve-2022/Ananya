// Write a program to remove all occurrences of a given character from input String:
//Given string : To test this string >> remove all ‘t/T’ from this string and print .

import java.util.Arrays;
import java.util.List;

class Test
{
	static String remCh(String str)
	{
		Character ch[] = {'t', 'T'};
		
		List<Character> al = Arrays.asList(ch);
		
		StringBuffer sb = new StringBuffer(str);
		
		for (int i = 0; i < sb.length(); i++) {
			
			if(al.contains(sb.charAt(i))){
				sb.replace(i, i+1, "") ;
				i--;
			}
		}
		
		
		return sb.toString();
	}
	// Driver method to test the above function
	public static void main(String[] args)
	{
		String str = "To test this string";
		
		System.out.println(remCh(str));
	}
}
