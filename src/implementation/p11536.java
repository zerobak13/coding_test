package implementation;

import java.util.Scanner;

public class p11536 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        sc.nextLine();
        int inc=0;
        int dec=0;
        String[]names=new String[N];
        for(int i=0;i<N;i++){
            names[i]=sc.nextLine();
        }
        for(int i=0;i<N-1;i++){
            if(names[i].compareTo(names[i+1])<0){
                inc=1;
            }
            else if(names[i].compareTo(names[i+1])>0){
                dec=1;
            }
            else{
                continue;
            }
        }

        if(dec==1&&inc==1){
            System.out.println("NEITHER");
        }
        else if(dec==1&&inc==0){
            System.out.println("DECREASING");
        }
        else{
            System.out.println("INCREASING");
        }
    }
}
