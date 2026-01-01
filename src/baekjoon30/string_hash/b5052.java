package baekjoon30.string_hash;

import java.util.Arrays;
import java.util.Scanner;

public class b5052 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++) {
            boolean check=true;
            int N=sc.nextInt();
            String[] strs = new String[N];
            for(int j=0;j<N;j++){
                strs[j]=sc.next();
            }
            Arrays.sort(strs);
            for(int x=0;x<N-1;x++){
                if(strs[x+1].startsWith(strs[x])){
                    check=false;
                }
            }
            if(check){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }

    }
}
