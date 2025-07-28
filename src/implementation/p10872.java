package implementation;

import java.util.Scanner;

public class p10872 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(factorial(N));
    }

     static int factorial(int n){
        int result=0;
        if(n==1||n==0){
            return 1;
        }
        result=n*factorial(n-1);
        return result;
    }
}
