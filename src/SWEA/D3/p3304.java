package SWEA.D3;

import java.util.Scanner;

public class p3304 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            String str1=sc.next();
            String str2=sc.next();
            int N=str1.length();
            int M=str2.length();
            int[][]arr=new int[N+1][M+1];
            for(int i=1;i<=N;i++){
                for(int j=1;j<=M;j++){
                    if(str1.charAt(i-1)==str2.charAt(j-1)){
                        arr[i][j]=arr[i-1][j-1]+1;
                    }
                    else{
                        arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                    }
                }
            }
            System.out.println("#"+tc+" "+arr[N][M]);
        }

    }
}
