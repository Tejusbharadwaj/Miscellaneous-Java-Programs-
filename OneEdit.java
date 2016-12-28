
public class OneEdit {
	public static void main(String[] args){
		String s1="Pale";
		String s2="Bala";
		check(s1,s2);
		
	}

	private static void check(String s1, String s2) {
		// TODO Auto-generated method stub
		int f= s1.length();
		int s= s2.length();
//		int grt=(f>s)?f:s;
//		int sm=(s>f)?s:f;
		int i=0,j=0;
		int count=0;
		while(i<f && j<s){
			if(s1.charAt(i)!=s2.charAt(j)){
				
				count++;
				if(f==s){
				i++;
				j++;
			}
				
			if(f>s) i++;
			if (s>f)j++;
		}
		}
		if(count>1){
			System.out.println("false");
		}
		
	}

}
