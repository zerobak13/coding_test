package SWEA.D2;

import java.util.Arrays;
import java.util.Scanner;

public class p1984 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        int []arr=new int[10];
        for(int tc=1;tc<=T;tc++){
            int sum=0;
            for(int i=0;i<10;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=1;i<9;i++){
                sum+=arr[i];
            }
            double result=sum/8.0;
            System.out.println("#"+tc+" "+Math.round(result));

        }

    }
}
