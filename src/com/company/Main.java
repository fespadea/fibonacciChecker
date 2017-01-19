package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a number to check if its a Fibonacci number.");
        Scanner in = new Scanner(System.in);
        int pi = in.nextInt();
        if(fib.checker(pi, 0, 1)){
            System.out.print(pi + " is a Fibonacci number. Here are the numbers leading up to it: ");
            fib.sequence(pi, 0, 1);
        }
        else{
            System.out.println("Nope.");
        }
    }
}
