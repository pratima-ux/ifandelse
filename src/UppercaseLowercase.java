import java.util.Scanner;

public class UppercaseLowercase //class name
{
    public static void main(String[] args)  //main method
    {


        Scanner scanner = new Scanner(System.in); //created scanner object
        System.out.println("enter upercase"); //promting user to enter Uppercase letter
        char ch = scanner.next().charAt(0);
        int a = (int) ch;           //changes the char in to the int

        //System.out.print(a);
        a = (ch + 32); //it will change the value

        char b=(char)a;
        System.out.println(b);  //print out the result

    }
}
