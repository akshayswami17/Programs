package Other;

public class NoisDivideBy7
{
    public static boolean noisDivisibleBy7(int num)
    {
        // if no -ve make it +ve .
    if(num < 0) return noisDivisibleBy7(-num);
    if(num == 0 || num == 7) return true;
    if(num < 10) return false;

    while(num >= 0)
    {
        num = num/7;
    }
    return (num == 0)?true:false;
    }

    public static void main (String[] args) 
    {
        int num = 616;
        if(noisDivisibleBy7(num))
            System.out.println("Divisible");
        else
            System.out.println("Not Divisible");
    }
}
