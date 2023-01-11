package com.knoldus;

import java.util.Scanner;

public class Q2 {

    /**
     * The base case will be, if N becomes equal to zero, then  we will  return,
     *  otherwise we'll print the name, and again call the solve function.
     *
     *     <pre>
     *                  solve(N) --> suppose N is 3,
     *                     |
     *                  solve(3) --> we'll check if 3 is equal to 0 or not, base condition fails, we calls solve fun again and reduce n by 1 and print the number.
     *                  /
     *                solve(2) --> again check if 2 is equal to 0 or not, base condition fails, we calls solve fun again and reduce n by 1 and print the number.
     *                /
     *            solve(1) --> again check if  1 is equal to 0 or not, base condition fails, we calls solve fun again and reduce n by 1 and print the number.
     *              /
     *          solve(0)  --> now N is equal to 0,this will hit the base condition, { if(N==0) } and will return
     *
     *     </pre>
     * @param n
     */
    void solve(int n){
        if(n==0)
            return;
        solve(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Q2 q2 = new Q2();
        q2.solve(n);
    }
}
