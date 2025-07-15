package BF;

import java.util.ArrayList;
import java.util.Scanner;

public class p2851 {
    public static void main(String[] args) {
        int sum1=0;

        int index=0;
        Scanner sc=new Scanner(System.in);

        int []arr= new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        while(sum1+arr[index]<100){

            sum1+=arr[index];
            index++;
            if(index == 10) {
                System.out.println(sum1);
                return;
            }
        }


        int sum2=sum1;
        sum2+=arr[index];
        if(100-sum1>sum2-100){
            System.out.println(sum2);
        }
        else if(100-sum1<sum2-100){
            System.out.println(sum1);
        }
        else{
            System.out.println(sum2);
        }

    }
}
