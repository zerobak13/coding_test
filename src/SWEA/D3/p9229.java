package SWEA.D3;

import java.util.Scanner;

public class p9229 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int max_weight=-1;
            int N=sc.nextInt();
            int M=sc.nextInt();
            int[]arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<N-1;i++){
                for(int j=i+1;j<N;j++) {
                    int num=arr[i]+arr[j];
                    if(num>max_weight&&num<=M){
                        max_weight=num;
                    }
                }
            }
            System.out.println("#"+tc+" "+max_weight);
        }
    }
}
