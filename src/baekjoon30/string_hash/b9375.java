package baekjoon30.string_hash;

import java.util.HashMap;
import java.util.Scanner;

public class b9375 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int c=sc.nextInt();
            HashMap<String,Integer>map=new HashMap<>();
            for(int j=0;j<c;j++){
                String name=sc.next();
                String cloth=sc.next();
                map.put(cloth,map.getOrDefault(cloth,0)+1);
            }
            int result=1;
            for(int x:map.values()){
                result*=(x+1);
            }
            System.out.println(result-1);
        }
    }
}
