package implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p27964 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Set<String>s=new HashSet<>();
        for(int i=0;i<n;i++){
            String cheese=sc.next();
            if(cheese.endsWith("Cheese")){
                s.add(cheese);
            }
        }
        if(s.size()>=4){
            System.out.println("yummy");
        }
        else{
            System.out.println("sad");
        }
    }
}
