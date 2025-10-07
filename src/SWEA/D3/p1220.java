package SWEA.D3;

import java.util.Scanner;

public class p1220 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        for(int tc=1;tc<=10;tc++){
            int n=sc.nextInt();
            int [][]arr=new int[100][100];

            for(int i=0;i<100;i++){
                for(int j=0;j<100;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int count=0;
            for(int i=0;i<100;i++){
                boolean flag=false;
                for(int j=0;j<100;j++) {
                    if(arr[j][i]==1){
                        flag=true;
                    }
                    if(flag&&arr[j][i]==2){
                        flag=false;
                        count++;
                    }
                }
            }
            System.out.println("#"+tc+" "+count);


        }
    }
}
