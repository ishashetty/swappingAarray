/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solutionswap;

/**
 *
 * @author Acer PC
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solutionswap {

    // Complete the swapToSort function below.
    static int swapToSort(int[] a) {
        // Return -1 or 0 or 1 as described in the problem statement.
        int count=0,temp;
        int t[]=new int[a.length];
        for(int i=0;i<a.length;i++)
            t[i]=a[i];
        for(int i=0;i<a.length-1;i++){
            for(int j=a.length-1;j>=i;j--){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    count++;
                }
        }
    }
        if(count==1)
            return 1;
        else if(count==0) 
            return 0;
        return -1;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = swapToSort(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

