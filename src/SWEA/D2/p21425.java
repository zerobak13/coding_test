package SWEA.D2;

import java.util.Scanner;

public class p21425 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int A=sc.nextInt();
            int B=sc.nextInt();
            int N=sc.nextInt();
            int count=1;
            while(A+B<=N){
                count++;
                if(A>B){
                    B=A+B;
                }
                else{
                    A=A+B;
                }
            }
            System.out.println(count);
        }







//        Scanner sc= new Scanner(System.in);
//        int T=sc.nextInt();
//        for(int tc=1;tc<=T;tc++){
//
//            int A=sc.nextInt();
//            int B=sc.nextInt();
//            int N=sc.nextInt();
//            int sum=0;
//
//            System.out.println(dfs(A,B,N,1));
//        }
//
//
//    }
//    static int dfs(int A,int B,int N,int count){
//
//        if(A+B>N){
//            return count;
//        }
//        int add=A+B;
//        int max=Math.max(A,B);
//
//        return dfs(add,max,N,count+1);
//    }
    }
}
