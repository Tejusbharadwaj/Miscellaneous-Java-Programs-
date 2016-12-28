import java.util.HashSet;
import java.util.Set;

public class LongestSub {
	 public int lengthOfLongestSubstring(String s) {
	        
	        Set<Character> set = new HashSet<>();
	        int ans =0;
	        int i=0,j=0;
	        
	        int size = s.length();
	        
	        while(i<size && j<size){
	            if(!set.contains(s.charAt(j))){
	                set.add(s.charAt(j));
	                j++;
	                ans=Math.max(ans,j-i);
	            }
	            else{
	                set.remove(s.charAt(i));
	                i++;
	            }
	        }
	       return ans;
	       
	        
	        
	    }

}
