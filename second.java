import java.util.Arrays;
public class second {
	public boolean checkArry(String str1, String str2){
		return sort(str1).equals(sort(str2));
	}

	public String sort(String s) {
		// TODO Auto-generated method stub
		char[] ch= s.toCharArray();
		System.out.println(ch);
		Arrays.sort(ch);
		
		System.out.println(ch);;
//		System.out.println("String is: " + String(ch));
		return new String(ch);
		
	}
	

}
