package Day1;

public class PalindromeString {
    public static boolean Islaindrome(String pal , int low , int high)
    {
        if(low >= high)
        {
            return pal.charAt(high) == pal.charAt(low);
        }
        else
        {
            return Islaindrome(pal, low+1, high-1);
        }
       
    }
    public static void main(String[] args) {
        String charStr = "dikShyaayhSkid";
       System.out.println(Islaindrome(charStr, 0 , charStr.length()-1)); 
    }
}
