package Strings;

import java.util.HashSet;
import java.util.Set;

public class _6_CheckIfGivenStringIsPangramOrNot 
{
    static boolean isPangram(String str)
    {
        Set<Character> set  = new HashSet<>();

        for (char ch : str.toCharArray()) {
            // If the character is already
            // a lowercase character
            if (ch >= 'a' && ch <= 'z')
                set.add(ch);
 
            // In case of a uppercase character
            if (ch >= 'A' && ch <= 'Z') {
                // convert to lowercase
                ch = Character.toLowerCase(ch);
                set.add(ch);
            }
        }
        
        return set.size() == 26;

    }

    public static void main(String[] args) 
    {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(str));
        
        
    }
    
}
