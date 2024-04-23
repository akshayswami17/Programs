public class ArmstsrongNumber
{
    public static boolean isArmstsrongNumber(int number)
    {
        int temp = number , count = 0,sum=0,mod;
        

        while(temp>0)
        {
            temp = temp/10 ;
            count++;
        }
        temp = number;
        while(temp>0)
        {
            mod = temp%10;
            sum+=Math.pow(mod,count);
            temp = temp/10;

        }
       return sum==number;
    }
    public static void main(String[] args) 
    {
        System.out.println("Is Amstrong"+isArmstsrongNumber(153));
        
    }
}