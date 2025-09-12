package SWEA.D2;

import java.util.*;

public class p1983 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        String[]grade={"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
        for(int tc=1;tc<=T;tc++){
            int N=sc.nextInt();
            int K=sc.nextInt();

            Double[]totals=new Double[N];
            for(int i=0;i<N;i++){
                int mid=sc.nextInt();
                int fin=sc.nextInt();
                int ass=sc.nextInt();
                double total=mid*0.35+fin*0.45+ass*0.2;
                totals[i]=total;

            }
            Double target_score=totals[K-1];
            Arrays.sort(totals, Collections.reverseOrder());
            int rank=1;
            for(double x:totals){
                if(x==target_score){
                    break;
                }
                rank++;
            }
            int grade_pos=rank/(N/10);
            if(rank%(N/10)!=0){
                grade_pos++;
            }
            grade_pos--;
            System.out.println("#"+tc+" "+grade[grade_pos]);


        }
    }
}
