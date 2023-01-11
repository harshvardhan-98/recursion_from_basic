package com.knoldus;

import java.util.ArrayList;
import java.util.Scanner;

// Print all subsequences of array including empty sub-array,

public class Q3 {

    public static void solve(int ind, ArrayList<Integer> list, int ar[], int n){
        if(ind == n){
            if (list.size() > 0)
                System.out.print(list);

            if(list.size() ==0 )
                System.out.print("{ }");
            System.out.println();
            return ;
        }

        solve(ind+1, list, ar, n);
        list.add(ar[ind]);
        solve(ind+1, list, ar, n);
        list.remove(list.size()-1);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of array elements: ");
        int n = scanner.nextInt();
        int [] ar = new int[n];
        for (int i =0;i<n;i++){
            ar[i] = scanner.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        solve(0, list, ar, n);
    }
}
