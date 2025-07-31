package implementation;

import java.util.*;

public class p11866 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        Queue<Integer>q=new LinkedList<>();
        for(int i =0;i<N;i++){
            q.add(i+1);
        }
        List<Integer> result = new ArrayList<>();
        while(!q.isEmpty()){
            for(int i=0;i<K-1;i++){
                q.offer(q.poll());
            }
            result.add(q.poll());
        }
        System.out.print("<");
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i));
            if(i!=result.size()-1){
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
