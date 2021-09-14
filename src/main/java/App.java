import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App 
{
    public static void main( String[] args )
    {
        final String secret = new String("abc$123");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String user = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        if (password.equals(secret)) {
            System.out.println("Welcome " + user + "!");
        } else {
            System.out.println("I don't know you.");
        }
    }
}
