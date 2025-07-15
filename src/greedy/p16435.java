package greedy;
import java.util.*;

import java.util.Scanner;

public class p16435 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int N=sc.nextInt();
        int L=sc.nextInt();
        Integer[]fruits=new Integer[N];
        for(int i=0;i<N;i++){
            fruits[i]=sc.nextInt();
        }
        Arrays.sort(fruits);
        for(int i=0;i<N;i++){
            if(L>=fruits[i]){
                L+=1;
            }
        }
        System.out.println(L);


    }
}
