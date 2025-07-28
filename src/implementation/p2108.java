package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class p2108 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[]arr=new int[N];
        int sum=0;
        int []count=new int[8001];
        for(int i =0; i<N;i++){
            int num=sc.nextInt();
            arr[i]=num;
            sum+=num;
            count[num+4000]++;

        }
        Arrays.sort(arr);
        int max=0;

        for(int i=0; i<8001;i++){
            if(max<count[i]){
                max=count[i];

            }
        }
        int freq=0;
        int check=0;
        for(int i=0;i<8001;i++){
            if(count[i]==max){
                check++;
                freq=i;
                if(check==2){
                    break;
                }
            }
        }
        System.out.println(Math.round((double)sum/N));
        System.out.println(arr[N/2]);
        System.out.println(freq-4000);
        System.out.println(arr[N-1]-arr[0]);




    }
}
