package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p18310 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        List<Integer>homes=new ArrayList<>();
        for(int i=0; i<N;i++){
            homes.add(sc.nextInt());
        }
        Collections.sort(homes);
        if(N%2==0){
            System.out.println(homes.get(N/2-1));
        }
        else{
            System.out.println(homes.get(N/2));
        }

    }
}
