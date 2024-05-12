package FibonacciSeries;

public class FibonacciSeriesUsingIterativeApproach 
{
    public static void FibonacciSeries(int fno , int sno , int last_number)
    {
        for(int i=0 ; i< last_number ; i++)
        {
            System.out.print(fno+",");
            int nextfibo = fno + sno ;
            fno = sno;
            sno = nextfibo;
        }
    }
    public static void main(String[] args) 
    {
        FibonacciSeries(0, 1, 10);
    }
    
}
