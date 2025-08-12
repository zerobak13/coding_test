package greedy;

import java.util.Scanner;

public class p6550 {
    private static boolean isSubstring(String s,String t){

        int i=0,j=0;
       while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
       if(i==s.length()){
           return true;
       }
       else{
           return false;
       }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.next();
            String t = sc.next();

            if (isSubstring(s, t)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
sc.close();
    }
}
