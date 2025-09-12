package SWEA.D2;

import java.util.Scanner;

public class p1974 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int[][]arr=new int[9][9];
            int result=1;
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<9;i++){
                boolean []check=new boolean[10];
                for(int j=0;j<9;j++){
                    if(check[arr[i][j]]){
                        result=0;
                        //System.out.println(result);
                        break;
                    }
                    check[arr[i][j]]=true;
                }
            }
            for(int i=0;i<9;i++){
                boolean []check=new boolean[10];
                for(int j=0;j<9;j++){
                    if(check[arr[j][i]]){
                        result=0;
                       // System.out.println(result);
                        break;
                    }
                    check[arr[j][i]]=true;
                }
            }
            for(int i=0;i<=6;i+=3){
                for(int j=0;j<=6;j+=3){
                    //System.out.println(i+" "+j);
                    boolean []check=new boolean[10];
                    for(int n=0;n<3;n++){
                        for(int m=0;m<3;m++){
                            //System.out.print(arr[i+n][j+m]);
                            if(check[arr[i+n][j+m]]){
                                result=0;
                                break;
                            }
                            check[arr[i+n][j+m]]=true;
                        }
                    }
                    //System.out.println();
                }
            }


            System.out.println("#"+tc+" "+result);


        }
    }
}
