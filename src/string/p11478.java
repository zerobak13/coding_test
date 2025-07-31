package string;

import java.util.HashSet;
import java.util.Scanner;

public class p11478 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        HashSet<String> result=new HashSet<>();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                result.add(str.substring(i,j));
            }
        }
        System.out.println(result.size());

    }
}
