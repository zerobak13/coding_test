package SWEA.D3;

import java.util.Scanner;

public class p1216 {
    static char[] line;
    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc <= 10; tc++) {
            int tc_num = sc.nextInt();
            arr = new char[100][100];
            for (int i = 0; i < 100; i++) {
                String line = sc.next();
                for (int j = 0; j < line.length(); j++) {
                    arr[i][j] = line.charAt(j);
                }
            }
            int max_len=0;
            //가로
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    for (int k = j; k < 100; k++) {
                        //가로
                        if(check_r(i, j, k)){
                            max_len=Math.max(max_len,k-j+1);
                        }
                        //세로
                        if(check_c(i, j, k)){
                            max_len=Math.max(max_len,k-j+1);
                        }

                    }


                }

            }


            System.out.println("#"+tc_num+" "+max_len);

        }

    }

    //가로체크
    static boolean check_r(int i, int start, int end) {
        while (start < end) {
            if (arr[i][start] != arr[i][end]) {
                return false;
            }
            start++;
            end--;

        }
        return true;

    }
    //세로체크
    static boolean check_c(int i, int start, int end) {
        while (start < end) {
            if (arr[start][i] != arr[end][i]) {
                return false;
            }
            start++;
            end--;

        }
        return true;

    }
}

