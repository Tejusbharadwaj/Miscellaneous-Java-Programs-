
public class LongestPalindrome {
	public String longestPalindrome(String s) {
		if (s.isEmpty()) {
			return null;
		}
	 
		if (s.length() == 1) {
			return s;
		}
	 
		String longest = s.substring(0, 1);
		System.out.println("longest: "+longest);
		for (int i = 0; i < s.length(); i++) {
			// get longest palindrome with center of i
			String tmp = helper(s, i);
			System.out.println("temp1 " +tmp);
			if (tmp.length() > longest.length()) {
				longest = tmp;
				System.out.println("longest1: "+longest);
			}
	 
			
		}
	 
		return longest;
	}
	 
	// Given a center, either one letter or two letter, 
	// Find longest palindrome
	public String helper(String s, int index) {
		int begin=index, end=index;
		while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		System.out.println("helper: "+s.substring(begin + 1, end));
		return s.substring(begin + 1, end);
	}
	
	
	
	public static void main(String[] args){
		String s= "xyxabcba";
		LongestPalindrome l= new LongestPalindrome();
		String r= l.longestPalindrome(s);
		System.out.println(r);
		
	}

}
