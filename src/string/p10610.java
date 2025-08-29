package string;

import java.util.*;

public class p10610 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        String N=sc.next();
        boolean zero=false;
        List<Integer>num_list=new ArrayList<>();

        for(int i=0;i<N.length();i++){
            if(N.charAt(i)=='0'){
                zero=true;
            }
           num_list.add(N.charAt(i)-'0');

        }
        Collections.sort(num_list,Collections.reverseOrder());
        StringBuilder sb=new StringBuilder();

        for(int x:num_list){
            sum+=x;
        }
        if(zero&&sum%3==0){
            for(int x:num_list){
                sb.append(x);
            }
            System.out.println(sb);
        }
        else{
            System.out.println("-1");
        }
    }
}
