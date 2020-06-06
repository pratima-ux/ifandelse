import java.util.Scanner;

public class VowelOrConsonant
{
    public static void main(String[] args) //main method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Any Alphabet to find out if its Vowel or Consonant : "); //promting user to enter alphabet

        char a = scanner.next().charAt(0);  //using char dadtatype to enter single alphabets
        if (a == 'a')
        {
            System.out.println(a + " is Vowel ");   // printing out the result if the word is vowel or consonateby using if/else loop
        } else if (a == 'e') {
            System.out.println(a + " is Vowel ");
        } else if (a == 'i') {
            System.out.println(a + " is Vowel ");
        } else if (a == 'o') {
            System.out.println(a + " is Vowel ");
        } else if (a == 'u') {
            System.out.println(a + " is Vowel ");
        } else {
            System.out.println(a + " is a Consonant ");
        }
    }
}
