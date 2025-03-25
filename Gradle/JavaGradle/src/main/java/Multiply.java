import java.io.*;

/**
 * Purpose: demonstrate simple Java Multiply class with command line,
 * jdb debugging, and Gradle build file.
 *
 * Ser321 Foundations of Distributed Applications
 * @author Aman Kaushik
 * @version August 2020 Alexandra Mehlhase changes for Gradle
 */
public class Multiply {
    public static void main(String args[]) {
        int argX = 1;
        int argY = 2;

        if (args.length == 2) {
            try {
                argX = Integer.parseInt(args[0]);
                argY = Integer.parseInt(args[1]);
            } catch (Exception e) {
                System.out.println("Arguments: " + args[0] + ", " + args[1] + " must be integers.");
                System.exit(1);
            }
        } else if (args.length == 0) {
            System.out.println("No arguments provided, using default values: " + argX + ", " + argY);
        } else {
            System.out.println("Invalid number of arguments. Please provide exactly 2 integers.");
            System.exit(1);
        }

        System.out.println(argX + " * " + argY + " = " + (argX * argY));
    }
}
