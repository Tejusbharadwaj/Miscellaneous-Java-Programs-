import java.lang.*;
public class replace {
	public void replaceAll(String str){
		
		String temp= str.trim();
		
		char[] a = temp.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<a.length;i++){
			if(a[i]==' '){
				sb.append("%20");
				
			}
			else
				sb.append(a[i]);
		}
		System.out.println(sb.toString());
	}

}
