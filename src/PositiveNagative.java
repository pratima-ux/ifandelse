import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class PositiveNagative
{
    public static void main(String[] args)     //main method
    {
        Scanner scanner = new Scanner(System.in); // created scanner object
        System.out.print("Enter any Value Please "); // prompting user to enter any value
        int value= scanner.nextInt();

        if (value<0)   //using if and else loop
        {
            System.out.println("Entered value is Negative number ");//printing the result if the value is nagative

        }
        else if (value==0)

            {
                System.out.println("You have entered Zero");//printing the result if the value is zero
            }


               else
               {
                System.out.println("You have entered Positive number");//printing the result if the value is positive
                }

    }
}
