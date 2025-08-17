package greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p20300 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        long[]arr=new long[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextLong();
        }
        Arrays.sort(arr);
        long M=Long.MIN_VALUE;
        int right=N-1;
        int left=0;
        if(N%2==1){
            M=arr[right];
            right--;
            while(left<right){
                M=Math.max(M ,arr[left]+arr[right]);
                left++;
                right--;
            }
        }
        else{

            while(left<right){
                M=Math.max(M ,arr[left]+arr[right]);
                left++;
                right--;
            }
        }
        System.out.println(M);
    }
}
