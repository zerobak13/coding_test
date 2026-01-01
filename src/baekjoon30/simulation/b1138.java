package baekjoon30.simulation;

import java.util.Scanner;

public class b1138 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]num=new int[N];
        int[]result=new int[N];
        for(int i=0;i<N;i++){
            num[i]=sc.nextInt();
            int temp=num[i];
            int pos=0;
            while(temp>0){
                if(result[pos]==0){
                    temp--;

                }
                pos++;

            }
            while(result[pos]!=0){
                pos++;
            }
            result[pos]=i+1;

        }
        for(int x:result){
            System.out.print(x+" ");
        }

    }
}
