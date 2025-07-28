package string;

import java.util.Arrays;
import java.util.Scanner;

public class p11656 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        String[]s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=str.substring(i);
        }
        Arrays.sort(s);

        for(String result:s){
            System.out.println(result);
        }
    }
}
