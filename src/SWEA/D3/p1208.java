package SWEA.D3;

import java.util.Arrays;
import java.util.Scanner;

public class p1208 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for(int T=1;T<=10;T++){
            int dump=sc.nextInt();
            int []arr=new int[100];
            for(int i=0;i<100; i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<dump;i++){
                Arrays.sort(arr);
                int diff=arr[99]-arr[0];
//                System.out.println(arr[99]);
//                System.out.println(arr[0]);
                if(diff==1){
                    System.out.println("1");
                    return;
                }
                else if (diff==0) {
                    System.out.println("0");
                    return;
                }

                else if(diff>1){
                    arr[99]--;
                    arr[0]++;

                }


            }
            Arrays.sort(arr);
            System.out.println("#"+T+" "+(arr[99]-arr[0]));



        }
    }



}
