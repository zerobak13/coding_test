package SWEA.D3;

import java.util.*;

public class p5948 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        int[]arr=new int[7];
        for(int tc=1;tc<=T;tc++){
            for(int i=0;i<7;i++){
                arr[i]=sc.nextInt();
            }
            Set<Integer>s=new HashSet<>();
            int sum=0;
            for(int i=6;i>=2;i--){
                for(int j=i-1;j>=1;j--){
                    for(int k=j-1;k>=0;k--){
                        sum=arr[i]+arr[j]+arr[k];
                        s.add(sum);
                    }
                }
            }

            List<Integer>result=new ArrayList<>(s);
            Collections.sort(result,Collections.reverseOrder());
            System.out.println("#"+tc+" "+result.get(4));



        }


    }
}
