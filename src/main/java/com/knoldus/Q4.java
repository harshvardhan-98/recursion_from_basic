package com.knoldus;

import java.util.ArrayList;
import java.util.Scanner;

// Print all subsequences of array, whose sum is equal to the given target sum.
public class Q4 {

    public static void solve(int ind, int sum, int target, ArrayList<Integer> list, int ar[], int n){
        if(ind == n){
            if(sum == target){
                if (list.size() > 0)
                    System.out.print(list);
                if(list.size() == 0)
                    System.out.print("{ }");
                System.out.println();
            }
            return;
        }

        list.add(ar[ind]);
        sum += ar[ind];
        solve(ind+1, sum, target, list, ar,n);
        list.remove(list.size()-1);
        sum -= ar[ind];
        solve(ind+1, sum, target, list, ar,n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of array elements: ");
        int n = scanner.nextInt();
        int [] ar = new int[n];
        for (int i =0;i<n;i++){
            ar[i] = scanner.nextInt();
        }
        System.out.print("Enter target sum value: ");
        int targetSum = scanner.nextInt();
        int Sum=0;
        ArrayList<Integer> list = new ArrayList<>();
        solve(0, Sum, targetSum, list, ar, n);
    }
}
