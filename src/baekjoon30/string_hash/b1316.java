package baekjoon30.string_hash;

import java.util.Scanner;

public class b1316 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int count=0;
        for(int i=0;i<N;i++){
            String str=sc.next();
            boolean check=true;
            int []visited=new int[26];
            visited[str.charAt(0)-'a']++;
            for(int j=1;j<str.length();j++){
                int pos=str.charAt(j)-'a';
                if(visited[pos]!=0){
                    if(str.charAt(j)!=str.charAt(j-1)){
                        check=false;
                    }
                }
                else{
                    visited[pos]++;
                }


            }
            if(check){
                count++;
            }
        }
        System.out.println(count);
    }
}
