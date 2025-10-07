package SWEA.D3;

import java.util.Scanner;

public class p6190 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int N=sc.nextInt();
            int[]arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]= sc.nextInt();
            }
            int result=-1;
            for(int i=0;i<N-1;i++){
                for(int j=i+1;j<N;j++){
                    int number=arr[i]*arr[j];
                    if(isDanzo(number)){
                        result=Math.max(result,number);
                    }
                }
            }
            System.out.println("#"+tc+" "+result);

        }
    }
    static boolean isDanzo(int num){
        String s_num=Integer.toString(num);

        for(int i=0;i<s_num.length()-1;i++){
            if(s_num.charAt(i)-'0'>s_num.charAt(i+1)-'0'){
                return false;
            }
        }
        return true;
    }
}
