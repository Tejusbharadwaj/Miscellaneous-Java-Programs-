public class StringPermutationClass
{   
    static public void stringPermutation(String input)
    {
        stringPermutation("", input);
    }
     
    private static void stringPermutation(String permutation, String input)
    {    
        if(input.length() == 0)
        {
            System.out.println(permutation);
        }
        else
        {
            for (int i = 0; i < input.length(); i++)
            {    
//            	0System.out.println("input.substring(0, i)+input.substring(i+1, input.length()): "+input.substring(0, i)+input.substring(i+1, input.length()));
                stringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
            }
        }
    }
     
    public static void main(String[] args) 
    {
        stringPermutation("aab");
    }    
}