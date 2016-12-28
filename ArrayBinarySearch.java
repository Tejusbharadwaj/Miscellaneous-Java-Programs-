import java.util.Arrays;

public class ArrayBinarySearch {
	public static void main(String[] args) {

		   
		   byte byteArr[] = {10,20,15,22,35};
		   char charArr[]={'c','g','a'};

		   // sorting array
		   Arrays.sort(charArr);
		   Arrays.sort(byteArr);

		   // let us print all the elements available in list
//		   System.out.println("The sorted byte array is:");
//		   for (byte number : byteArr) {
//		   System.out.println("Number = " + number);
//		   }

		   // entering the value to be searched
		   byte searchVal = 35;
		   char s= 'a';

		   int retVal = Arrays.binarySearch(byteArr,searchVal);
		   int retVal1 = Arrays.binarySearch(charArr,s);

		   System.out.println("The index of element 35 is : " + (retVal1+1));
		   }

}
