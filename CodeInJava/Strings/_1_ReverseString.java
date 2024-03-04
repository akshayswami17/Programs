package Strings;
import java.util.*;

class Reverse {
    public static String reverse(String str) {
        if(str == null) {
            throw new IllegalArgumentException("input string is null");
        }
        
        StringBuilder out = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            out.append(chars[i]);
        }
        
        return out.toString();
    }
}

public class _1_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter string : ");
        String str = sc.next();
        System.out.println(Reverse.reverse(str));
    }
}
