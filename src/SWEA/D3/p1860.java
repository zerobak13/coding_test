package SWEA.D3;

import java.util.Arrays;
import java.util.Scanner;

public class p1860 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int N=sc.nextInt();
            int M=sc.nextInt();
            int K=sc.nextInt();


            int[]arrive=new int[N];
            for(int i=0;i<N;i++){
                arrive[i]=sc.nextInt();

            }
            Arrays.sort(arrive);

            int last_arrive=arrive[N-1];
            boolean possible=true;
            int bread=0;
            for(int i=0;i<=last_arrive;i++) {
                if(i!=0&&i%M==0){
                    bread+=K;
                }
                for(int j=0;j<N;j++){
                    if(arrive[j]==i){
                        bread--;
                        if(bread<0){
                            possible=false;
                            break;
                        }
                    }
                }
            }



            if(possible){
                System.out.println("#" + tc + " " +"Possible");
            }
            else{
                System.out.println("#" + tc + " " +"Impossible");
            }

        }
    }
}
