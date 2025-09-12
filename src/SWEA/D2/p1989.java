package SWEA.D2;

import java.util.Scanner;

public class p1989 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            String word=sc.next();
            boolean same=true;
            char[]arr=new char[word.length()];
            for(int i=0;i<word.length();i++){
                arr[(word.length()-1)-i]=word.charAt(i);
            }
            //System.out.println(arr);
            for(int i=0;i<word.length();i++) {

                if(arr[i]!=word.charAt(i)){
                    same=false;
                    break;
                }

            }
            System.out.print("#"+tc+" ");
            if (same) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }


        }
    }
}
