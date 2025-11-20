package SWEA.D3;

import java.util.Scanner;

public class p1221 {
    static String[]words={"ZRO","ONE","TWO","THR","FOR","FIV","SIX","SVN","EGT","NIN"};
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            String tag=sc.next();
            int num_len=sc.nextInt();
            int[]count=new int[10];
            for(int i=0;i<num_len;i++){
                String num=sc.next();
                for(int j=0;j<10;j++){
                    if(words[j].equals(num)){
                        count[j]++;
                        break;
                    }
                }
            }
            System.out.println(tag);
            for(int i=0;i<10;i++){
                for(int j=0;j<count[i];j++){
                    System.out.print(words[i]+" ");
                }
            }
            System.out.println();
        }
    }
}
