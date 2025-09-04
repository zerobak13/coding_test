package SWEA.D2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p1204 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int num;
        for(int i=0;i<T;i++){
            int test_num=sc.nextInt();
            Map<Integer,Integer>map=new HashMap<>();
            for(int j=0;j<1000;j++){
                num=sc.nextInt();
                map.put(num,map.getOrDefault(num,0)+1);
            }
            int max_key= 0;
            int max_value=0;
            for(Map.Entry<Integer,Integer>entry: map.entrySet()){

                if(max_value<entry.getValue()||
                        (max_value== entry.getValue()&&max_key< entry.getKey())){


                    max_value= entry.getValue();
                    max_key= entry.getKey();
                }

            }

            System.out.println("#"+(i+1)+" "+max_key);
        }
    }
}
