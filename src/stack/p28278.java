package stack;
import java.io.*;
import java.util.*;

public class p28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb= new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer>stack=new ArrayDeque<>();

        for(int i=0; i<N; i++){
            String input =br.readLine();
            if(input.startsWith("1")){
                int x=Integer.parseInt(input.split(" ")[1]);
                stack.push(x);
            }
            else if(input.equals("2")){
                sb.append(stack.isEmpty()? -1: stack.pop()).append('\n');
            }
            else if(input.equals("3")){
                sb.append(stack.size()).append('\n');
            }
            else if(input.equals("4")){
                sb.append(stack.isEmpty()?1:0).append('\n');
            }
            else if(input.equals("5")){
                sb.append(stack.isEmpty()?-1:stack.peek()).append('\n');
            }

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
