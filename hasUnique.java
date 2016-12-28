import java.util.HashSet;
import java.util.Set;

public class hasUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "abcdefa";
		Set<Character> set=new HashSet<>();
		for(int i=0;i<s.length();i++){
			if(!set.add(s.charAt(i))){
				System.out.println("DUplicate is: "+s.charAt(i));
//				break;
			}
			
			
		}
		
			System.out.println("No Duplicates");
		

	}

}
