package string;

import java.util.Scanner;

public class p1652 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        char [][]arr=new char[N][N];
        for(int i=0;i<N;i++){
            String line=sc.next();
            for(int j=0;j<N;j++){
                arr[i][j]=line.charAt(j);
            }
        }
        int ver=0;
        int hor=0;
        for(int i=0;i<N;i++){
            int temp_count=0;
            int seat_count=0;
            for(int j=0;j<N;j++){
                if(arr[i][j]=='X'){
                    if(temp_count>=2){
                        seat_count++;
                    }
                    temp_count=0;

                }
                if(arr[i][j]=='.'){
                    temp_count++;
                }

            }
            if(temp_count>=2){
                seat_count++;
            }
            hor+=seat_count;

        }



        for(int i=0;i<N;i++){
            int temp_count=0;
            int seat_count=0;
            for(int j=0;j<N;j++){
                if(arr[j][i]=='X'){
                    if(temp_count>=2){
                        seat_count++;
                    }
                    temp_count=0;

                }
                if(arr[j][i]=='.'){
                    temp_count++;
                }

            }
            if(temp_count>=2){
                seat_count++;
            }
            ver+=seat_count;

        }
        System.out.println(hor+" "+ver);

    }
}
