package greedy;

import java.util.Scanner;

public class p3135 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();

        int min=Math.abs(A-B);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            int num=sc.nextInt();
            if(min>Math.abs(B-num)){
                min=Math.abs(B-num)+1;
            }
        }
        System.out.println(min);




    }
}
