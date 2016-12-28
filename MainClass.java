import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<PairInt<Integer,Integer>> list= new ArrayList<PairInt<Integer,Integer>>();
		list.add(new PairInt<>(1,2));
		list.add(new PairInt<>(2,3));

		for(int i=0;i<list.size();i++){
			int l=list.getLeft();
			System.out.println(S.getLeft()+ "," + S.getRight());
			
		}

	}

}
