package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p20920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        Map<String,Integer>d=new HashMap<>();
        for(int i=0;i<N;i++){
            String str=br.readLine();
            if(str.length()<M){
                continue;
            }
            d.put(str,d.getOrDefault(str,0)+1);
        }
        List<String>words=new ArrayList<>(d.keySet());

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(Integer.compare(d.get(o1),d.get(o2))!=0){
                    return Integer.compare(d.get(o2),d.get(o1));
                }
                if(o1.length()!=o2.length()){
                    return o2.length()-o1.length();
                }
                return o1.compareTo(o2);
            }
        });

        StringBuilder sb= new StringBuilder();
        for(String s:words){
        sb.append(s +"\n");
        }
        System.out.println(sb);

    }
}
