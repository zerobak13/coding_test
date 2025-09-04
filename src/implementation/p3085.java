package implementation;

import java.util.Scanner;

public class p3085 {
    static int N=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        String [][]arr=new String[N][N];

        for(int i=0;i<N;i++){
            String line=sc.next();
            for(int j=0;j<N;j++){
                arr[i][j]=String.valueOf(line.charAt(j));
            }
        }
        int max_result=checkMax(arr);

        for(int i=0;i<N;i++) {
            for (int j = 0; j < N; j++) {
                //오른쪽 스왑
                if(j+1<N&&!arr[i][j].equals(arr[i][j+1])){
                    String temp=arr[i][j];
                    arr[i][j]=arr[i][j+1];
                    arr[i][j+1]=temp;
                    if (max_result < checkMax(arr)) {
                        max_result = checkMax(arr);
                    }
                    temp=arr[i][j];
                    arr[i][j]=arr[i][j+1];
                    arr[i][j+1]=temp;

                }
                //아래쪽 스왑
                if(i+1<N&&!arr[i][j].equals(arr[i+1][j])){
                    String temp=arr[i][j];
                    arr[i][j]=arr[i+1][j];
                    arr[i+1][j]=temp;
                    if (max_result < checkMax(arr)) {
                        max_result = checkMax(arr);
                    }
                    temp=arr[i][j];
                    arr[i][j]=arr[i+1][j];
                    arr[i+1][j]=temp;
                }



            }
        }
        System.out.println(max_result);

    }



    static int checkMax(String arr[][]){
        int max=1;
        //행검사
        for(int i=0;i<N;i++){
            int count=1;
            String alpha=arr[i][0];
            for(int j=1;j<N;j++){

                if(alpha.equals(arr[i][j])){
                    count++;
                }
                else{
                    alpha=arr[i][j];
                    if(max<count){
                        max=count;
                    }
                    count=1;
                }

            }
            if(max<count){
                max=count;
            }

        }
        //열검사
        for(int i=0;i<N;i++){
            int count=1;
            String alpha=arr[0][i];
            for(int j=1;j<N;j++){

                if(alpha.equals(arr[j][i])){
                    count++;
                }
                else{
                    alpha=arr[j][i];
                    if(max<count){
                        max=count;
                    }
                    count=1;
                }

            }
            if(max<count){
                max=count;
            }

        }


        return max;
    }
}
