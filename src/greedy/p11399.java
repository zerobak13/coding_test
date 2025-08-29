package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class p11399 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int []arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for(int i=1;i<N;i++){
            arr[i]=arr[i]+arr[i-1];
            //System.out.println(arr[i]);
            sum+=arr[i];
        }
        System.out.println(arr[0]+sum);
    }
}
