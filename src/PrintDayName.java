import java.util.Scanner;

public class PrintDayName
{
    public static void main(String[] args)        //main method
    {
        Scanner scanner = new Scanner(System.in);     //created scanner object
        System.out.print("enter first no: ");
        int num1 = scanner.nextInt();

        if (num1 == 1)
        {
            System.out.println("Its Sunday ");//print out result in console
        }
        else if (num1 == 2)                   //by using if and else if loop
        {
            System.out.println("Its Monday "); // by inputting any no to get days name accordingly
        }
        else if (num1 == 3)
        {
            System.out.println("Its Tuesday ");
        }
        else if (num1 == 4)
        {
            System.out.println("Its Wednesday ");
        }
        else if (num1 == 5)
        {
            System.out.println("Its Thursday ");
        }
        else if (num1 == 6)
        {
            System.out.println("Its Friday ");
        }
        else if (num1 == 7)
        {
            System.out.println("Its Saturday ");
        }
    }
}
