package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class p2012 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long result=0;
        int N=sc.nextInt();
        int[]arr=new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=1;i<=N;i++){
            result+=Math.abs(arr[i]-i);
        }
        System.out.println(result);
    }
}
