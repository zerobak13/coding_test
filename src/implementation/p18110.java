package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class p18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        double[]arr=new double[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int cut=(int)Math.round(n*0.15);
        double sum=0;
        for(int i=cut+1;i<=n-cut;i++){
            sum+=arr[i];
        }
        System.out.println(Math.round(sum/(n-2*cut)));
    }
}
