import java.util.Scanner;
public class GradeResult
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);            // Create scanner object
        System.out.print("Please enter your Roll No: ");// Prompting user to enter English marks
        int roll_no = scanner.nextInt();

        System.out.print("Please enter your Name : ");// Prompting user to enter English marks
        String name = scanner.next();

        System.out.print("Please enter your Maths mark: ");// Prompting user to enter Maths marks
        int maths = scanner.nextInt();

        System.out.print("Please enter your English marks: ");// Prompting user to enter English marks
        int english = scanner.nextInt();

        System.out.print("Please enter your Science marks:  ");// Prompting user to enter Science marks
        int science = scanner.nextInt();

        double total = maths + english + science;   // created total datatype to get total of 3 subject

        double percentage = total / 3; //getting percentage by deviding total by 3

        System.out.println("Total marks =" + total);
        System.out.println("Percentaes = " + percentage + " % ");// printing the result in console

        if (percentage <= 35)
        {
            System.out.println("Unfortunatley you have Fail"); // printing msg if the marks are <35
        }
        else if(percentage >= 35 && percentage < 50)
        {
            System.out.println("Congratulation "+ name+ " You have c Grade");// printing msg if the marks are >35and <50
        }
        else if (percentage >= 50 && percentage < 60)
        {
            System.out.println("Congratulation "+ name+ " You have B Grade");// printing msg if the marks are >50and <60
        }
        else if (percentage >= 60 && percentage < 80)
        {
            System.out.println("Congratulation "+ name+ " You have A Grade");// printing msg if the marks are >60and <80
        }
        else if (percentage >= 80 && percentage < 100)
        {
            System.out.println("Congratulation "+ name+ " You have A+ Grade");// printing msg if the marks are >80and <100
        }else
          {
         System.out.println("Invalid Entry");
         }


    }



}
