import java.util.Scanner;
public class electrity_bill
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        int bill = units <= 100 ? units * 2 :
                units <= 150 ? 100 * 2 + (units - 100) * 3 :
                        units <= 200 ? 100 * 2 + 50 * 3 + (units - 150) * 4:
                                100 * 2 + 50 * 3 + 50 * 4 + (units - 200) * 5;

        System.out.println("bill " + bill);
    }

}