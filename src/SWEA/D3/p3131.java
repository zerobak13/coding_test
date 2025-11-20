package SWEA.D3;

import java.util.Scanner;

public class p3131 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for(int i=2;i<=1000000;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isPrime(int num){
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
