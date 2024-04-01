//Converting Roman Numerals to Decimal lying between 1 to 3999
package Numbers.Conversion;

import java.util.*;

public class RomanToNumber {
    int value(char c) {
        if (c == 'I')
            return 1;
        if (c == 'V')
            return 5;
        if (c == 'X')
            return 10;
        if (c == 'L')
            return 50;
        if (c == 'C')
            return 100;
        if (c == 'D')
            return 500;
        if (c == 'M')
            return 1000;
        return -1;

    }

    int romanToDecimal(String str) {
        int result = 0, i;
        for (i = 0; i < str.length(); i++) {
            int s1 = value(str.charAt(i));
            if (i + 1 < str.charAt(i + 1)) {
                int s2 = value(str.charAt(i + 1));
            
            // compair s1 and s2 .
            if (s1 >= s2) {
                result = result + s1;
            } else {
                result = result + s2 - s1;
                i++;
            }

            }
            else{
                result=result+s1;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RomanToNumber rn = new RomanToNumber();
        System.out.print("Enter the ROMAN number :");
        String str = sc.nextLine();
        System.out.println(str+" : "+rn.romanToDecimal(str));

    }

}
