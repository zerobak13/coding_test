package SWEA.D2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p1928 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        String base="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<base.length();i++){
            map.put(base.charAt(i),i);
        }
        String result="";
        for(int tc=1;tc<=T;tc++){
            String line=sc.next();
            StringBuilder sb=new StringBuilder();

            for(int i=0;i<line.length();i+=4) {
                int n=0;
                for(int j=0;j<4;j++){
                   int num =map.get(line.charAt(i+j));
                   n=(n<<6)+num;
                }
                char c1=(char)((n>>16)&0xFF);
                char c2=(char)((n>>8)&0xFF);
                char c3=(char)((n)&0xFF);
                sb.append(c1).append(c2).append(c3);
            }
            System.out.println("#"+tc+" "+sb);


        }
    }
}
