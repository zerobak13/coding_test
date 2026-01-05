package baekjoon30.simulation;

import java.util.Scanner;

public class b1475 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result=0;
        String str=sc.next();
        int []check=new int[10];
        int count=0;
        for(int i=0;i<str.length();i++){
            int num=str.charAt(i)-'0';
            if(num==6||num==9){
                count++;
            }

            else {
                check[num]++;
            }
        }
        if(count%2==0){
            check[6]=count/2;
        }
        else{
            check[6]=(count/2)+1;
        }

        for(int x:check){
            result=Math.max(result,x);
        }
        System.out.println(result);

    }
}
