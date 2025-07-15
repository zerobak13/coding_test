package implementation;

import java.util.Scanner;

public class p8979 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();

        int [][]arr=new int[N][4];

        for(int i=0;i<N;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int g=0, s=0, b=0;
        for(int i=0;i<N;i++){
            if(arr[i][0]==K){
                g=arr[i][1];
                s=arr[i][2];
                b=arr[i][3];
            }
        }

        int rank=1;
        for(int i=0;i<N;i++) {
            if(arr[i][0]==K){
                continue;
            }

            if((arr[i][1]>g)||
                    (arr[i][1]==g&&arr[i][2]>s)||
                    (arr[i][1]==g&&arr[i][2]==s&&arr[i][3]>b)){
                rank++;
            }
        }


        System.out.println(rank);


    }
}
