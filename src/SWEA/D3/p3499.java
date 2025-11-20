package SWEA.D3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p3499 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int num=sc.nextInt();
            List<String>str1= new ArrayList<>();
            List<String>str2= new ArrayList<>();
            for(int j=0;j<(num+1)/2;j++){
                String str=sc.next();
                str1.add(str);

            }
            for(int j=((num+1)/2)+1;j<=num;j++){
                String str=sc.next();
                str2.add(str);
            }

            int length=Math.max(str1.size(),str2.size());
            System.out.print("#"+tc+" ");
            for(int j=0;j<length;j++){
                if(str1.size()>j) {
                    System.out.print(str1.get(j) + " ");
                }
                if(str2.size()>j) {
                    System.out.print(str2.get(j) + " ");
                }
            }
            System.out.println();
        }
    }
}
