package implementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p1966 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int priority=0;

        int N=sc.nextInt();

        for(int i=0;i<N; i++){
            int []freq=new int[10];
            int T=sc.nextInt();
            int pos=sc.nextInt();
            Queue<int[]>q=new LinkedList<>();
            for(int index=0;index<T;index++){
                priority=sc.nextInt();
                q.offer(new int[]{priority,index});
                freq[priority]++;
            }
            int printed=0;
            while(!q.isEmpty()){
                boolean check=false;

                int[]arr=q.poll();
                for(int j=arr[0]+1;j<10;j++) {
                    if (freq[j]>0) {
                        check=true;
                        break;
                    }
                }
                if(check){
                    q.offer(arr);
                }
                else{
                    printed++;
                    freq[arr[0]]--;
                   if(arr[1]==pos){
                       System.out.println(printed);
                       break;
                   }
                }
            }

        }
    }

}
