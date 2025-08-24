package string;

import java.util.Scanner;

public class p1251 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();

        int n=word.length();
        String result=null;

        for(int i=1;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                String s1=new StringBuilder(word.substring(0,i)).reverse().toString();
                String s2=new StringBuilder(word.substring(i,j)).reverse().toString();
                String s3=new StringBuilder(word.substring(j,n)).reverse().toString();

                String candidate=s1+s2+s3;
                if(result==null||result.compareTo(candidate)>0) {
                    result = candidate;
                }

            }
        }
        System.out.println(result);
    }
}
