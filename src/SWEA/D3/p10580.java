package SWEA.D3;

import java.util.Arrays;
import java.util.Scanner;

public class p10580 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int N=sc.nextInt();
            int[][]arr=new int[N][2];
            for(int i=0;i<N;i++){
              arr[i][0]=sc.nextInt();
              arr[i][1]=sc.nextInt();
            }
            Arrays.sort(arr,(a,b)->a[0]-b[0]);
            int count=0;
            for(int i=0;i<N-1;i++){
                for(int j=i+1;j<N;j++){
                    if(arr[i][0]<arr[j][0]&&arr[i][1]>arr[j][1]){
                        count++;
                    }
                }
            }
            System.out.println("#"+tc+" "+count);

        }

    }
}
