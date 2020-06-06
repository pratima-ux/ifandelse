import java.util.Scanner;

public class Average
{
    public static void main(String[] args) //main method
    {
        Scanner scanner = new Scanner(System.in);//created scanner object

        System.out.print("Enter First number :"); // prompting user to enter number
        int one = scanner.nextInt();
        System.out.print("Enter Second number :"); // prompting user to enter number
        int two = scanner.nextInt();

        System.out.print("Enter Third number :");  // prompting user to enter number
        int three = scanner.nextInt();
        System.out.print("Enter Fourth number :");   // prompting user to enter number
        int four = scanner.nextInt();
        System.out.print("Enter Fifth number :");   // prompting user to enter number
        int five = scanner.nextInt();

        double total= one + two + three + four + five;  //counting the total of five numers

        double average = total/5;   //finding out the average of five numbers

        System.out.println("The Average of above 5 number is :" + average); //printing out the result by using concatination


    }
}
