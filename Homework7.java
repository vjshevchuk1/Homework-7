/**
 * AIT-TR, cohort 42.1, Java Basic, Home work   #7
 *
 * @autor Vitalij Shevchuk
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Hello, World!
        System.out.println("Task 1:");
        System.out.println("Hello, World!");

        // Task 2: Cannon Game
        System.out.println("\nTask 2: Cannon Game");
        int targetDistance = (int) (Math.random() * 100) + 1;
        System.out.println("The target is at a distance of " + targetDistance + " meters.");
        System.out.print("Enter the angle (in degrees): ");
        double angle = scanner.nextDouble();
        System.out.print("Enter the initial velocity (in meters per second): ");
        double velocity = scanner.nextDouble();
        double g = 9.81;
        double distance = (Math.pow(velocity, 2) * Math.sin(2 * Math.toRadians(angle))) / g;
        if (distance < targetDistance) {
            System.out.println("Under shot! The projectile landed " + distance + " meters away.");
        } else if (distance > targetDistance) {
            System.out.println("Over shot! The projectile landed " + distance + " meters away.");
        } else {
            System.out.println("Target hit! The projectile landed exactly on target.");
        }

        // Task 3: Guess Number Game
        System.out.println("\nTask 3: Guess Number Game");
        int secretNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int guess;
        System.out.println("I've picked a number between 1 and 100. Try to guess it!");
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != secretNumber);
        System.out.println("Congratulations! You've guessed the number " + secretNumber + " in " + attempts + " attempts.");

        scanner.close();
    }
}
