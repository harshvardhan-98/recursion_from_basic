package com.knoldus;

import java.util.Scanner;

/**
 * Print your name N times, without using loop;
 */
public class Q1 {

    /*
    The base case will be, if N becomes equal to zero, then  we will  return.
    otherwise we'll print the name, and again call the printName function.
     */
    void printName(int N){
        if(N == 0) return; // base case.
        System.out.println("Harsh"+" ");
        printName(N-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Q1 q1 = new Q1();
        q1.printName(n);
    }
}
