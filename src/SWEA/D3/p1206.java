package SWEA.D3;

import java.util.Scanner;

public class p1206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //테스트 10케이스
        for(int i=0;i<10;i++){
            int N=sc.nextInt();
            int []arr=new int[N];

            for(int j=0;j<N;j++){
                arr[j]=sc.nextInt();
            }
            int sum=0;

            for(int k=2;k<N-2;k++){
                int max=0;
                if((k-2)>=0 && k+2<N){
                    for(int x=k-2;x<=k+2;x++){
                        if(x==k){
                            continue;
                        }
                        if(max<arr[x]){
                            max=arr[x];
                        }
                    }
                }
                if(arr[k]-max>0){
                    sum+=arr[k]-max;
                }

            }
                System.out.println("#"+(i+1)+" "+sum);


        }


    }
}


