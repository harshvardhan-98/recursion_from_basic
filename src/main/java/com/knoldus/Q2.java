package com.knoldus;

import java.util.Scanner;

public class Q2 {

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
