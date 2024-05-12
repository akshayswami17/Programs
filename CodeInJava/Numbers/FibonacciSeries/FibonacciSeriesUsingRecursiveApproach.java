package FibonacciSeries;

public class FibonacciSeriesUsingRecursiveApproach 
{
    public static int  FibonacciSeries(int n)
    {
        if(n<=1){ return n ; }
        return FibonacciSeries(n-1) + FibonacciSeries(n-2);

        
    }
    public static void main(String[] args) 
    {
        int last_number = 10 ;
        for(int i = 0 ; i< last_number ; i++)
        {
            System.out.print(FibonacciSeries(i)+" ");

        }
        
    }
}
