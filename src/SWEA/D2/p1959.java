package SWEA.D2;

import java.util.Scanner;

public class p1959 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }
            int big = 0;
            int small = 0;
            int sum = 0;
            int max = Integer.MIN_VALUE;
            if (n < m) {
                big = m;
                small = n;



                for (int i = 0; i <= big - small; i++) {

                    sum = 0;
                    for (int j = 0; j < small; j++) {
                        sum += arr1[j] * arr2[j + i];
                    }
                    if (max < sum) {
                        max = sum;
                    }
                }
                System.out.print("#"+tc+" ");
                System.out.println(max);
            } else {
                big = n;
                small = m;

                for (int i = 0; i <= big - small; i++) {

                    sum = 0;
                    for (int j = 0; j < small; j++) {
                        sum += arr2[j] * arr1[j + i];
                    }
                    if (max < sum) {
                        max = sum;
                    }
                }
                System.out.print("#"+tc+" ");
                System.out.println(max);


            }
        }
    }
}
