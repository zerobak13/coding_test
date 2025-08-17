package greedy;

import java.util.Scanner;

public class p2828 {
    public static void main(String[] args) {
        int distance=0;

        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int J=sc.nextInt();

        int left = 1;
        int right = M;
        int move=0;
        for(int i=1;i<=J;i++){
            int pos=sc.nextInt();
            if(pos>right||pos<left) {
                if (pos>right) {
                    move=pos - right;
                    distance += move;
                    left += move;
                    right += move;
                }
                else if (pos<left){
                    move=left-pos;
                    distance+=move;
                    left-=move;
                    right-=move;
                }
            }

        }
        System.out.println(distance);
    }
}
