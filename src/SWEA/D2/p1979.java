package SWEA.D2;

import java.util.Scanner;

public class p1979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int count = 0;

            for (int i = 0; i < N; i++) {
                int check = 0;
                for (int j = 0; j < N; j++) {
                    if (arr[i][j] == 1) {
                        check++;
                    } else {
                        if (check == K) {
                            count++;
                        }
                        check = 0;
                    }


                }
                if (check == K) {
                    count++;
                }


            }
            for (int i = 0; i < N; i++) {
                int check = 0;
                for (int j = 0; j < N; j++) {
                    if (arr[j][i] == 1) {
                        check++;
                    } else {
                        if (check == K) {
                            count++;
                        }
                        check = 0;
                    }


                }
                if (check == K) {
                    count++;
                }


            }
            System.out.println("#"+tc+" "+count);
        }
    }
}
