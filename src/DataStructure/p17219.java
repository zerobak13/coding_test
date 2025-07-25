package DataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p17219 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        sc.nextLine();

        Map<String,String> passwordMap=new HashMap<>();


        for(int i=0;i<N;i++){
            String str= sc.nextLine();
            String[]parts=str.split(" ");
            passwordMap.put(parts[0],parts[1]);
        }

        for(int i=0;i<M;i++){
            String target=sc.nextLine();
            System.out.println(passwordMap.get(target));
        }

        sc.close();
    }
}
