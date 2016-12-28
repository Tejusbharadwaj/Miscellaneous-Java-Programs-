import java.util.*;

public class PairInt<L,R> {
	private L left;
	private R right;
	
	public PairInt(L left, R right){
		this.left=left;
		this.right=right;	
	}

	public L getLeft(){
		return left;
	}
	public R getRight(){
		return right;
	}
	
}
