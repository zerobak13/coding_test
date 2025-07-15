package string;

import java.util.Scanner;


public class p1541 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String expr=sc.nextLine();

        String[]parts=expr.split("-");

        int result=sum(parts[0]);

        for(int i=1; i<parts.length;i++){
            result-=sum(parts[i]);
        }

        System.out.println(result);
    }

    static int sum(String str){
        String[]nums=str.split("\\+");
        int total=0;
        for(String n:nums){
            total+=Integer.parseInt(n);
        }
        return total;
    }
}
