package BF;

import java.util.Scanner;

public class p1051 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[][]map=new int[N][M];
        for(int i=0;i<N;i++){
            String line=sc.next();
            for(int j=0;j<M;j++){
                map[i][j]=line.charAt(j)-'0';
            }
        }
        int k=0;
        int max_width=1;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                k=0;
                while(i+k<N&&j+k<M){
                    if(map[i][j]==map[i][j+k]&&map[i+k][j]==map[i+k][j+k]&&map[i][j]==map[i+k][j+k]){
                        if(max_width<(k+1)*(k+1)){
                            max_width=(k+1)*(k+1);
                        }
                    }
                    k++;
                }
            }
        }

        System.out.println(max_width);


    }
}
