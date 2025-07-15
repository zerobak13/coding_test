package BF;

import java.util.Scanner;

public class p1969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        String[]dna=new String[N];

        for(int i=0;i<N;i++){
            dna[i]= sc.next();
        }
        char []new_dna=new char[M];
        char[]base={'A','C','G','T'};
        for(int i=0;i<M;i++){
            int[]count=new int[4];
            for(int j=0;j<N;j++){
                char c=dna[j].charAt(i);
                switch(c){
                    case 'A':count[0]++; break;
                    case 'C':count[1]++; break;
                    case 'G':count[2]++; break;
                    case 'T':count[3]++; break;
                }
            }
            int max_idx=0;//일단 A로 가정
            for(int k=1;k<4;k++){
                if(count[k]>count[max_idx]){
                    max_idx=k;
                }
            }
            new_dna[i]=base[max_idx];
        }
        int result=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(dna[i].charAt(j)!=new_dna[j]){
                    result++;
                }
            }
        }
        System.out.println(new String(new_dna));
        System.out.println(result);
        sc.close();

    }
}
