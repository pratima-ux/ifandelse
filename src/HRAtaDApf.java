import java.util.Scanner;

public class HRAtaDApf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);            // Create scanner object

        System.out.print("Please enter Employee  ID: ");// Prompting user to enter Employee Id
        int id = scanner.nextInt();

        System.out.print("Please enter Employee name : ");// Prompting user to enter Employee name
        String name = scanner.next();

        System.out.print("Please enter the Basic Salary :  ");// Prompting user to enter Basic Salary
        double salary = scanner.nextDouble();

        System.out.println("HRA is 10% of basic salary = " + salary * 0.010 ); //finding out HRA
        System.out.println("DA is 8% of basic salary = " + salary * 0.08);   //finding out DA
        System.out.println("TA is 9% of basic salary = " + salary * 0.09);    //finding out TA
        System.out.println("PF is 20% of basic salary = " + salary * 0.20);      //finding out PF



        System.out.println("gross salary is : "+ ((salary*0.10)+(salary*0.08)+(salary*0.09)-(salary*0.20)));
          // make concatination for gross salary

    }
}
