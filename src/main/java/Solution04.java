/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statements and use a scanner to save the inputs as a string
// Print out all statements in a single output

import java.util.Scanner;

public class Solution04
{
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter a noun: ");
        String noun = in.nextLine();

        System.out.println("Enter a verb: ");
        String verb = in.nextLine();

        System.out.println("Enter an adjective: ");
        String adjective = in.nextLine();

        System.out.println("Enter an adverb: ");
        String adverb = in.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " " +  noun + " " + adverb + "? That's hilarious!");
    }
}
