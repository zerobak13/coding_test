package BF;

import java.util.Scanner;

public class p1120 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<=B.length()-A.length();i++){
            String substr=B.substring(i,i+A.length());
            int diff=0;
            for(int j=0;j<A.length();j++){
                if(substr.charAt(j)!=A.charAt(j)){
                    diff++;
                }
            }
            if(diff<mindiff){
                mindiff=diff;
            }
        }
        System.out.println(mindiff);
    }
}
