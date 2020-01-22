package com.company;

import java.util.Scanner;

public class GetIntegers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, total = 0;

        System.out.println("Enter 10 numbers to get the total");
        for (int i = 1; i <= 11; i++){
            System.out.println("Enter a new number: ");
            num = scan.nextInt();
            total += num;
            System.out.println("New total: " + total);
        }
        System.out.println("The total of all 10 numbers is " + total);
    }
}
