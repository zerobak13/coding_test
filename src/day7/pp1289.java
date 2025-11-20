package day7;


import java.util.Scanner;

public class pp1289 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            String num=sc.next();
            int bit=0;
            int count=0;
            for(int i=0;i<num.length();i++){
                if((num.charAt(i)-'0')!=bit){
                    count++;
                    bit=(bit+1)%2;
                }
            }
            System.out.println("#"+tc+" "+count);

        }
    }
}

