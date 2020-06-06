import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)               //main method
    {
        Scanner scanner=new Scanner(System.in);          //Create a scanner object

        System.out.print("Input any Year: ");
        int year=scanner.nextInt();                      //call int out in scanner
        String m= (year % 4 == 0)? "Leap Year ": "Not a Leap Year";  //getting reslt by deviding value by 4
                                          //checking if it's a leap year or not by using ternary operator
        System.out.println( year + " is " + m);  // printing out result


    }

}
