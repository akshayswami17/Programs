package Strings;
import java.util.*;
class Check_Palindrome
{
    public static boolean check_palindrome(String str)
    {
        //boolean result = true;
        StringBuilder out = new StringBuilder();
        char[] chars = str.toCharArray();
        for(int i = chars.length-1;i>=0;i--)
        {
            out.append(chars[i]);
        }
        String result=out.toString();

        if(result.equals(str))
           return true;
        else
           return false;

    }
}
public class _2_PalindromeString
{
    public static void main(String[] args) {
        
        System.out.println(Check_Palindrome.check_palindrome("akka"));
        
    }
}