import java.util.Scanner;

public class PassorFail
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

            double total = maths + english + science;

            double percentage = total / 3;

            System.out.println("Total marks =" + total);
            System.out.println("Percentaes = " + percentage + " % ");



            if (maths> 35 && english > 35 && science>35)
            {
                System.out.println("Conratulation " + name + " You have passed the exam with "+ percentage+ "%");
            }
                   else
                       {
                           System.out.println("Unfortunatly You have failed");
                       }

        }


}






