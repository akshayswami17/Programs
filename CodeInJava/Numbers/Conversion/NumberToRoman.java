package Conversion;

public class NumberToRoman 
{
    public static int sub_digit(char num1,char num2,int i,char[] c)
    {
        c[i++] = num1;
        c[i++] = num2;
        return i;
    }

    public static int digit(char ch,int n,int i,char[]c)
    {
        for(int j=0;j<n;j++)
        {
            c[i++] = ch;
        }
        return i;
    }

    public static void convertNumberToRoman(int number)
    {
        char [] c = new char[100001];
        int i = 0;
        if(number <= 0)
        {
            System.out.println("Invalid number , try it again.");
            return ;
        }

        while(number != 0)
        {
            if(number>=1000)
            {
                i= digit('M',number/1000,i,c);
                number = number%1000;
             }
            else if(number>=500 && number<900)
            {
                i= digit('D',number/500,i,c);
                number = number%500;
             }
            else if(number>=100 && number<400)
            {
                i= digit('C',number/100,i,c);
                number = number%100;
             }
        }
    }
    
}
