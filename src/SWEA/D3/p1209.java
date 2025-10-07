package SWEA.D3;

import java.util.Scanner;

public class p1209 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for(int tc=1;tc<=10;tc++){
            int [][]arr=new int[100][100];
            int max=0;
            int sum=0;
            int tc_num=sc.nextInt();
            for(int i=0;i<100;i++){
                for(int j=0;j<100;j++){
                    arr[i][j]=sc.nextInt();
                }
            }

            //가로
            for(int i=0;i<100;i++){
                sum=0;
                for(int j=0;j<100;j++){
                    sum+=arr[i][j];
                }
                if(max<sum){
                    max=sum;
                }
            }
            //세로
            for(int i=0;i<100;i++){
                sum=0;
                for(int j=0;j<100;j++){
                    sum+=arr[j][i];
                }
                if(max<sum){
                    max=sum;
                }
            }
            sum=0;
            //우하향대각선
            for(int i=0;i<100;i++){
                sum+=arr[i][i];
            }
            if(sum>max){
                max=sum;
            }
            sum=0;
            //좌하향대각선
            for(int i=0,j=99;i<100&&j>=0;i++,j--) {
                    sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
            }
            System.out.println("#"+tc_num+" "+max);
        }

    }
}
