package string;

import java.util.Scanner;

public class p1357 {

    static int reverse(int num){
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int a=reverse(X);
        int b=reverse(Y);
        int result=reverse(a+b);
        System.out.println(result);

    }
}