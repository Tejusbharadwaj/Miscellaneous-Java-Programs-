package ibm;

import java.util.*;

public class SameEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1={2,3,4,5,8};
		int[] a2={2,5,8,4};
//		find(a1,a2);
		
		AnotherApproach a = new AnotherApproach();
		a.chec(a1, a2);
		

	}
	
	public static void find(int[] a, int[] b){
		int[] small=(a.length<b.length)?a:b;
		int[] bigger=(b.length>a.length)?b:a;
		List<Integer> c =new ArrayList<>();
		List<Integer> comm=new ArrayList<>();
		for(int x:small){
			c.add(x);
		}
		
		for(int x:bigger){
			if(c.contains(x)){
				comm.add(x);
				
			}
			
		}
		print(comm);
	}
	
	public static void print(List<Integer> comm){
		for(int x:comm){
			System.out.println(x);
		}
	}
	

}
