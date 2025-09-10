import java.util.Scanner;

public class Challenge1_4
{
    public static void main(String[] args)
    {
        // Fill in values for these variables
        System.out.print("Enter the current year: ");
        Scanner scan = new Scanner(System.in);
        int currentYear = scan.nextInt();
        System.out.print("Enter the year you were born: ");
        int birthYear = scan.nextInt();
        System.out.print("Enter the year your dog was born: ");
        int dogBirthYear = scan.nextInt();

        // Write a formula to calculate your age from the currentYear and
        // your birthYear variables
        int age = currentYear - birthYear;

        // Write a formula to calculate your dog's age from the currentYear
        // and dogBirthYear variables
        int dogAge = currentYear - dogBirthYear;

        // Calculate the age of your dog in dogYears (7 times your dog's age
        // in human years)
        int dogYearsAge = dogAge * 7;

        // Print out your age, your dog's age, and your dog's age in dog
        // years. Make sure you print out text too so that the user knows what
        // is being printed out.

        System.out.println("You are " + age + " years old.");
        System.out.println("Your dog is " + dogAge + " human years old.");
        System.out.println("Your dog is " + dogYearsAge + " dog years old");

        scan.close();
   }
}
