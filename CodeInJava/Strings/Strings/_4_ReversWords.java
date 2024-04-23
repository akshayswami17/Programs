package Strings;

public class _4_ReversWords {
    public static void main(String[] args) {
        String str[] = "i like program very mech".split(" ");
        String ans = "";
        for(int i = str.length-1 ;  i >=0 ; i--)
        {
            ans+=str[i]+" ";
        }
        System.out.println(ans);
    } 
    
}
