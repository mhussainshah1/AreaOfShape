package com.company;

import java.util.Scanner;

/**
 * Write an application to calculate the area of a circle, triangle, rectangle or square.
 * <p>
 * Have the user input the shape they want to calculate the area for and then based on that, get the input needed to
 * make that calculation.
 * <p>
 * Area of a circle = π*r2 (For simplicity, let's set π = 3.14)
 * Area of a triangle = (1/2)b*h (base x height)
 * Area of a rectangle = l*w (length x width)
 * Area of a square = a2 (a is the length of one side of a square)
 * Write methods for each area calculation.
 */
public class Main {

    public static void main(String[] args) {
        promptUser();
    }

    public static void promptUser() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter shape: ");
        String shape = keyboard.nextLine();

        switch (shape) {
            case "circle":
                System.out.print("Enter radius: ");
                int radius = keyboard.nextInt();
                System.out.printf("radius = %.2f ",getAreaOfCircle(radius));
                break;
            case "triangle":
                System.out.print("Enter base: ");
                int base = keyboard.nextInt();
                System.out.print("Enter height: ");
                int height = keyboard.nextInt();
                System.out.println(getAreaOfTriangle(base, height));
                break;
            case "rectangle":
                System.out.print("Enter length: ");
                int length = keyboard.nextInt();
                System.out.print("Enter breadth: ");
                int breadth = keyboard.nextInt();
                System.out.print(getAreaOfRectangle(length, breadth));
                break;
            case "square":
                System.out.print("Enter side: ");
                int side = keyboard.nextInt();
                System.out.print(getAreaOfSquare(side));
                break;
            default:
                System.out.println("Invalid Sahpe");
        }
    }

    public static double getAreaOfCircle(int radius) {
        return Math.PI * radius * radius;
    }

    public static double getAreaOfTriangle(int base, int height) {
        return base * height * 1 / 2;
    }

    public static double getAreaOfRectangle(int length, int width) {
        return length * width;
    }

    public static double getAreaOfSquare(int side) {
        return side * side;
    }
}
