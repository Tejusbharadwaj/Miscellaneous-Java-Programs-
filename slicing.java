
public class slicing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int window = 2;
		int[] arr= {1,2,3,4};
		 sum(arr,window);

	}
	public static void sum(int[] arr,int window){
		
		for(int i=0;i<=arr.length-window;i++){
			int sum=0;
			for(int j=0;j<window;j++){
				sum=sum+arr[i+j];
			
			}
			System.out.println(sum);
			System.out.println();
		}
		
	}

}
