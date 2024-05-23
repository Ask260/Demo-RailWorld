import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if((n%100==0 && n%40==0) ||n%4==0)
       {
           System.out.println(n+"year is a leap year");
       }
       else
       {
           System.out.println(n+"year is not a leap year");
       }
    }
}
