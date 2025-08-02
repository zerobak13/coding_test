package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p2960 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();

        boolean[]isRemoved=new boolean[N+1];
        int count=0;

        for(int i=2;i<=N;i++) {
            if (!isRemoved[i]) {
                for (int j = i; j <= N; j += i) {
                    if (!isRemoved[j]) {
                        isRemoved[j] = true;
                        count++;
                        if (count == K) {
                            System.out.println(j);
                            return;
                        }
                    }
                }
            }
        }


    }
}
