package SWEA.D3;

import java.util.Scanner;

public class p13038 {
    static int n;
    static int[]days;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();

        for(int tc=1;tc<=T;tc++){
            n=sc.nextInt();
            int result=Integer.MAX_VALUE;
            days=new int[7];
            for(int i=0;i<7;i++){
                days[i]=sc.nextInt();
            }
            for(int i=0;i<7;i++){
                if(days[i]==1){
                    result=Math.min(result,count_day(i));
                }
            }
            System.out.println("#"+tc+" "+result);


        }

    }
    static int count_day(int index){
        int count=0;
        int day=0;
        while(count<n){

            if(days[index]==1){
                count++;
            }
            index=(index+1)%7;
            day++;

        }


        return day;
    }
}
