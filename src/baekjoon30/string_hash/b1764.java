package baekjoon30.string_hash;

import java.util.*;

public class b1764 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        Set<String>s=new HashSet<>();
        for(int i=0;i<N;i++){
            s.add(sc.next());
        }
        List<String>l=new ArrayList<>();
        for(int i=0;i<M;i++){
            String str=sc.next();
            if(s.contains(str)){
                l.add(str);
            }
        }
        Collections.sort(l);
        System.out.println(l.size());
        for(String x:l){
            System.out.println(x);
        }

    }
}
