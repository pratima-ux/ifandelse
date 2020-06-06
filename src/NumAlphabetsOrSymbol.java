import java.util.Scanner;

public class NumAlphabetsOrSymbol {

    public static void main(String[] args)         //main method
    {
        Scanner scanner = new Scanner(System.in);    //created scanner object

        System.out.print("Enter value :");
         char a= scanner.next().charAt(0);  //created char datatype
          if ((a>='0')&&(a<='9'))
         {
             System.out.println("value is number ");  //printing out result
           }
         else if ((a>='a'&&a<='z') || (a>='A'&&a<='Z'))  //checking if its capital letter or small
         {
               System.out.println("value is alphabet"); //printing out the result as a alphabet
          }
         else
           {
              System.out.println("value is symbol");  //printing out the result as a symbol
          }

    }
}
