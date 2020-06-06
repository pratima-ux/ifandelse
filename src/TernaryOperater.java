import java.util.Scanner;
public class TernaryOperater
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);    //Create object

        System.out.println("Please enter first number");                  //you need to enter first number
        int first  = scanner.nextInt();//defining scanner class
        String test = (first % 2 == 0) ? "Even number" : "Odd number";   //using ternary operator with string
        System.out.println (first+" is "+test);//concatination

      System.out.println("Please enter second number");                    //you need to enter second number
       int second = scanner.nextInt();
       String test1= (second % 2 == 0 ) ? "Even number" : "Odd Number ";   //ternary operator with string
        System.out.println( second + " is " + test1);                      //concatination
    }
}
