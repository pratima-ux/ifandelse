import java.util.Scanner;

public class InterchangeValue {


    public static void main(String[] args) {       //main method
        Scanner scanner = new Scanner(System.in);   // created scanner object
        System.out.println("Enter first value of A: ");  // prompting user to enter the value
        int a = scanner.nextInt();                      // created int to get the value
        System.out.println("Enter second value B: ");     // prompting user to enter the value
        int b = scanner.nextInt();
        int temp = a;  // transfers the value of temp in a
        a = b;         // transfers the value of a in b
        b = temp;     //transfers the value of b in temp
        System.out.println("First value interchage to : " + a);  //print out the result
        System.out.println("Second value interchange to : " + b);
    }
}


