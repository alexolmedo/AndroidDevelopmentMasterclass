package com.alexolmedo.learnjava;

/**
 * Created by Alexander on 5/11/2017.
 */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("My first Java Program");

        String alex;
        alex = "Alexander Olmedo";
        System.out.println(alex);

        int alexWeeklySalary = 32;
        int alexanderMonthlySalary = alexWeeklySalary * 4;
        System.out.println("Weekly salary: " + alexWeeklySalary);
        System.out.println("Monthly salary: " + alexanderMonthlySalary);

        int apples = 6;
        int oranges = 5;
        int fruit = apples + oranges;
        System.out.println("I have " + fruit + " fruits");

        int weeks = 130;
        double years = weeks / 52.0;
        System.out.println(weeks + " weeks is " + years + " years");

        System.out.println("Hello, " + alex + " here");
    }
}
