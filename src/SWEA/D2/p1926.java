package SWEA.D2;

import java.util.Scanner;

public class p1926 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            String num_s=Integer.toString(i);
            String num="";
            int count=0;
            for(int j=0;j<num_s.length();j++){

                if(num_s.charAt(j)=='3'||num_s.charAt(j)=='6'||num_s.charAt(j)=='9'){
                    count++;
                }

                num=num_s;


                if(count>0){
                    num="";
                    for(int k=0;k<count;k++){
                        num+='-';
                    }
                }

            }
            sb.append(num+" ");
        }
        System.out.println(sb);


    }
}
