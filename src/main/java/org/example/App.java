/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        final int COVERAGE = 350;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter room length in feet: ");
        double l = input.nextDouble();

        System.out.print("Enter room width in feet: ");
        double w = input.nextDouble();

        double area = l * w;
        double gallon = Math.ceil(area / COVERAGE);

        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.2f square feet.", gallon, area);
    }
}
