import java.util.*;
public class roman {
	public static void main(String[] args){
		List<String> list=new ArrayList<>();
		list.add("James I");
		list.add("James V");
		list.add("James II");
		list.add("James IX");
		
		for(String s:list){
		StringTokenizer st= new StringTokenizer(s,"");
		while(st.hasMoreTokens()){
			String x= st.nextToken();
			System.out.println(x);
			
		}
		
		}
		
		
	}

}
