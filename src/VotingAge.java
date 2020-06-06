import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Please enter your age: "); //promting user to enter age
        int age= scanner.nextInt();
        if (age >=18)
        {
            System.out.println("You are eligible to vote"); // print the result eligible if user has entered the age over 18
        }
        else                            //by using if else loop
        {
            System.out.println("You are Not eligible to vote"); // print the result eligible if user has entered the age below 18
        }
    } //end loop

}
