package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p1946 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            int[]people=new int[N+1];
            for(int j=0;j<N;j++) {
                int doc = sc.nextInt();
                int meet = sc.nextInt();
                people[doc] = meet;
            }
            int max_people=0;
            int min_rate=Integer.MAX_VALUE;
            for(int j=1;j<=N;j++){
                if(min_rate>people[j]){
                    min_rate=people[j];
                    max_people++;
                }
            }
            System.out.println(max_people);



        }



    }


}
