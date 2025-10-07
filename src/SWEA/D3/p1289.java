package SWEA.D3;

import java.util.Scanner;

public class p1289 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            String line=sc.next();
            boolean flag=false;//0,1
            int count=0;
            if(line.charAt(0)=='1'){
                count++;
            }
            for(int i=1;i<line.length();i++){
                if(line.charAt(i)!=line.charAt(i-1)){
                    count++;
                }
            }
            System.out.println("#"+tc+" "+count);

        }
    }
}
