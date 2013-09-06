import java.util.Scanner;

public class HelloWorldPrinter
{
    public static void main(String[] args)
    {
        // Some basic printing \\
        System.out.println("Hello, World!");
        System.out.println(3 + 4 + 5);
        System.out.println("3 + 4 + 5");
        System.out.println("Hello " + 5);
        
        // Arithmetic \\
        
        // Normal integers
        int foo = 5;
        System.out.println(foo);
        
        // Doubles (decimal numbers)
        double bar = 2.5;
        System.out.println(bar);
        
        foo = foo * 2;
        System.out.println(foo);
        
        System.out.println(foo + bar);
        
        // If-statements
        if (foo > 1)
        {
            System.out.println("foo is larger than 1");
        }
        
        // Loops
        
        int n = 0;
        while (n < 10)
        {
            System.out.println(n);
            n++; // Increment n
        }
        
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i);
        }
        
        // Switch statement
        String bestClass = "te3";
        switch (bestClass)
        {
            case "na3":
                System.out.println("No!");
                break;
            case "te3":
                System.out.println("Correct!");
                break;
            default:
                System.out.println("Unknown class");
                break;
        }
        
        // Input
        // Remember to import java.util.Scanner
        Scanner reader = new Scanner(System.in);
        
        // Throws an exception if input was not an integer
        int userInt = reader.nextInt();
        
        reader.nextLine(); // Flush input, dirty
        
        System.out.println("You wrote the number " + userInt);
        
        String userInput = reader.nextLine();
        System.out.println("You wrote: " + userInput);
    }
}
