package string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p14425 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int result=0;
        int N=sc.nextInt();
        int M=sc.nextInt();
        sc.nextLine();

        Set<String> s =new HashSet<>();

        for(int i=0;i<N;i++){
            String str=sc.nextLine();
            s.add(str);
        }

        for(int i=0;i<M;i++){
            String input=sc.nextLine();
            if(s.contains(input)){
                result++;
            }
        }

        System.out.println(result);
    }
}
