package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p1448 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        int result=-1;
        int[] lines=new int[N];
        for(int i=0; i<N;i++){
            lines[i]=Integer.parseInt(bf.readLine());
        }
        Arrays.sort(lines);

        while(N>=3){

            if(lines[N-1]<lines[N-2]+ lines[N-3]){
                result=lines[N-1]+lines[N-2]+ lines[N-3];
                break;
            }
            if(N<=3){
                break;
            }
            N--;
        }
        System.out.println(result);

    }
}
