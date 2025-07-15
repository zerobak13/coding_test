package implementation;

import java.util.Scanner;

public class p1475 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String room =sc.nextLine();

        int[]count=new int[10];

        for(int i=0; i<room.length();i++){
            int num=room.charAt(i)-'0';
            count[num]++;
        }

        int sixNine=count[6]+count[9];
        count[6]=(sixNine+1)/2;
        count[9]=(sixNine+1)/2;

        int max=0;
        for(int i=0;i<10;i++){
            if(count[i]>max){
                max=count[i];
            }


        }
        System.out.println(max);
    }
}
