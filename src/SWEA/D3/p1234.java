package SWEA.D3;

import java.util.Scanner;
import java.util.Stack;

public class p1234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc <= 10; tc++) {
            int N = sc.nextInt();
            String line = sc.next();
            Stack<Integer>s=new Stack<>();
            for (int i = 0; i < line.length(); i++) {
                int num = line.charAt(i) - '0';
                if(!s.empty()&&s.peek()==num){
                    s.pop();
                }
                else{
                    s.push(num);
                }

            }
            System.out.print("#"+tc+" ");
            for(int x:s){
                System.out.print(x);
            }
            System.out.println();

        }
    }
}
