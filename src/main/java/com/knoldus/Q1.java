package com.knoldus;

import java.util.Scanner;

/**
 * Print your name N times, without using loop;
 */
public class Q1 {

    /**
     * The base case will be, if N becomes equal to zero, then  we will  return.
     *  otherwise we'll print the name, and again call the printName function.
     *
     *     <pre>
     *                  printName(N) --> suppose N is 3,
     *                     |
     *                  printName(3) --> we'll check if 3 is equal to 0 or not, base condition fails and we print the name, and reduce value of N by 1.
     *                  /
     *                printName(2) --> again check if 2 is equal to 0 or not, base condition fails and we print the name, and reduce value of N by 1.
     *                /
     *            printName(1) --> again check if  1 is equal to 0 or not, base condition fails and we print the name, and reduce value of N by 1.
     *              /
     *          printName(0)  --> now N is equal to 0,this will hit the base condition, { if(N==0) } and will return
     *
     *     </pre>
     * @param N
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
