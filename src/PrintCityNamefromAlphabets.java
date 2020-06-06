import java.util.Scanner;

public class PrintCityNamefromAlphabets {
    public static void main(String[] args)    //main method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Any Alphabets : ");//promting user to enter alphabet
        char alpha= scanner.next().charAt(0);

        if (alpha == 'a')               //used if and else if loop
        {
            System.out.println("Acton ");//print out the result by input alphabet and print city name acordingly
        }
        else if (alpha == 'b')
        {
            System.out.println(" Bristol ");
        }
        else if (alpha == 'c')
        {
            System.out.println(" Cambridge  ");
        }
        else if (alpha == 'd')
        {
            System.out.println(" Devon ");
        }
        else if (alpha == 'e')
        {
            System.out.println("Edinburgh ");
        }
        else if (alpha == 'f')
        {
            System.out.println(" Formbey ");
        }
        else
        {
            System.out.println("Its Invalid Entry ");
        }
    }
}


