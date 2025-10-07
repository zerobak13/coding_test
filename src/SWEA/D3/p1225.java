package SWEA.D3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p1225 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for(int tc=1;tc<=10;tc++){
            int tc_num=sc.nextInt();
            Queue<Integer>q=new LinkedList<>();
            for(int i=0;i<8;i++){
                int num=sc.nextInt();
                q.add(num);
            }
            int i=1;
            while(true){
                int temp=q.poll()-i;
                i++;
                if(i==6){
                    i=1;
                }
                if(temp<=0){
                    q.add(0);
                    break;
                }
                else{
                    q.add(temp);
                }
            }
            System.out.print("#"+tc_num);
            for(int x:q){
                System.out.print(" "+x);
            }
            System.out.println();
        }
    }
}
