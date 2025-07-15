package DataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p11652 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Long,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            long card=sc.nextLong();
            map.put(card,map.getOrDefault(card,0)+1);
        }
        int maxcount=0;
        long result=0;
        for(Map.Entry<Long,Integer> entry: map.entrySet()){
            long num=entry.getKey();
            int count=entry.getValue();

            if(maxcount<count){
                maxcount=count;
                result=num;
            }
            else if(count==maxcount && num<result){
                result=num;
            }
        }

        System.out.println(result);
    }
}
