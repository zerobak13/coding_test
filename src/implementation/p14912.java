package implementation;

import java.util.Scanner;

public class p14912 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String d=sc.next();

        int count=0;
        for(int i=1;i<=n;i++){
            String num=String.valueOf(i);
            for(int j=0;j<num.length();j++){
                if(String.valueOf(num.charAt(j)).equals(d)){//자바에서는 문자열 값 비쇼는 반드시 .equals사용
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
