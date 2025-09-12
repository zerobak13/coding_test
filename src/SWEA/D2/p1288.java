package SWEA.D2;

import java.util.Scanner;

public class p1288 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++) {
            int N = sc.nextInt();

            boolean check = false;

                int x=1;
                int[] num = new int[10];
                while(!check) {
                    //숫자를 문자열로
                    String s = String.valueOf(N*x);
                    for (int i = 0; i < s.length(); i++) {
                        int index=s.charAt(i)-'0';
                        num[index]++;
                        //num[Integer.parseInt(String.valueOf(s.charAt(i)))]++;
                    }
                    check=true;
                    for (int i = 0; i < 10; i++) {
                        if (num[i] == 0) {
                            check = false;
                        }

                    }
                    if (!check) {
                        x++;
                    } else {
                        System.out.println("#"+tc+" "+(x*N));
                    }
                }
            }



    }
}
