package Strings;
class _5_CheckIfGivenStringIsPangramOrNot
{
    public static String isPangram(String str)
    {
       boolean [] alphabetPresent = new boolean[26];
       for(int i = 0 ;i< str.length() ; i++)
       {
        char ch = str.charAt(i);
        if('A' <= ch && ch<= 'Z'){ alphabetPresent[ch-'A'] = true;}
        else if('a' <= ch && ch<='z'){ alphabetPresent[ch-'a'] = true;}
       }
        
       for(boolean present : alphabetPresent)
       {
        if(!present) { return "NO";}
       }
       return "YES";
    }
    public static void main(String[] args) 
    {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(str));
        
        
    }

}