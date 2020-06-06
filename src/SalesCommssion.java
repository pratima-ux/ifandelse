import java.util.Scanner;

public class SalesCommssion
{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);            // Create scanner object

        System.out.print("Please enter ID: ");// Prompting user to enter Maths marks
        int id = scanner.nextInt();

        System.out.print("Please enter Seller name : ");// Prompting user to enter English marks
        String seller = scanner.next();

        System.out.print("Please enter your Sales Amount :  ");// Prompting user to enter Science marks
        double sales_amt = scanner.nextDouble();

        System.out.print("Please enter your  Basic Salary : ");// Prompting user to enter Science marks
        double sal_basic = scanner.nextDouble();

        if (sales_amt >= 50000)
        {
            System.out.println(seller + "'s Commission is 35 % of sales amt : " + sales_amt * 0.35);
        }
        else if (sales_amt >= 30000)
        {
            System.out.println(seller + "'s Commission is 20 % of sales amt: " + sales_amt * 0.20);
        }
        else if (sales_amt >= 20000)
        {
            System.out.println(seller + "'s Commission is 10 % of sales amt : " + sales_amt * 0.10);
        }

        else if (sales_amt >= 10000)
        {
            System.out.println(seller + "'s Commission is 5 % of sales amt: " + sales_amt * 0.05);
        }
        else
            {
            System.out.println(seller + "'s Commission is 2 % of sales amt : " + sales_amt * 0.02);

             }
    }
}
