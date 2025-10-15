package SWEA.D3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p1228 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int tc=1;tc<=10;tc++){
            int N=sc.nextInt();
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<N;i++){
                int num=sc.nextInt();
                list.add(num);
            }
            int cmd_num=sc.nextInt();
            int cmd_count=0;
            while(cmd_count<cmd_num){
                String word=sc.next();
                int x=sc.nextInt();
                int y=sc.nextInt();

                for(int i=0;i<y;i++){
                    int s=sc.nextInt();
                    list.add(x++,s);
                }
                cmd_count++;
            }
            System.out.print("#"+tc+" ");
            for(int i=0;i<10;i++){
                System.out.print(list.get(i)+" ");
            }
                System.out.println();

            }
        }
}
