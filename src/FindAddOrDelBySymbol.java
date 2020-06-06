import java.util.Scanner;

public class FindAddOrDelBySymbol
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first no: ");       // prompting user to enter number
        int num1 = scanner.nextInt();
        System.out.print("enter second no: ");      // prompting user to enter number
        int num2 = scanner.nextInt();
        System.out.print(" eneter any symbol +, _, *,/  ");  // prompting user to enter any symbol
        char symbol= scanner.next().charAt(0);
        if (symbol=='+')             //used if/else loop to check the different combination
        {
            System.out.println("Addition of"+ num1 + " and " + num2+"  =  " + (num1 + num2) );
        }
        else if (symbol=='-')
        {
            System.out.println("Deletion of "+ num1 + " and " + num2 +" = " + (num1 -num2) );
        }
        else if (symbol=='*')
        {
            System.out.println("Multiplication of "+ num1 + " and " + num2 +" = " + (num1 * num2) );
        }
        else if (symbol=='/')
        {
            System.out.println("Devision of "+ num1 + " and " + num2 +" = "+ (num1 / num2) );
        }

        else
        {
            System.out.println("invalid entry  "); //if none of above right then print its invalid
        }

    }
}
