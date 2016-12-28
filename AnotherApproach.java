package ibm;
import java.util.*;
public class AnotherApproach {
	public void chec(int[] a, int[] b){
		Set<Integer> s= new HashSet<>();
		for(int i=0;i<a.length;i++){
			s.add(a[i]);
		}
		for(int i=0;i<b.length;i++){
			s.add(b[i]);
		}
		
		System.out.println(s);
		
	}

}
