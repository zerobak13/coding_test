package DataStructure;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class p1927 {//11279번 maxheap거의 동일함 컬렉션 리버스오더 추가하면 맥스힙임
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<N;i++){
            int num=sc.nextInt();
            if(num==0){
                if(pq.isEmpty()){
                    System.out.println(0);
                    continue;
                }
                System.out.println(pq.poll());
            }
            else{
                pq.offer(num);
            }
        }
    }
}
