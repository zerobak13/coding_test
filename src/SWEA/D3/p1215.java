package SWEA.D3;

import java.util.Scanner;

public class p1215 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char[][]arr=new char[8][8];
        for(int tc=1;tc<=10;tc++){
            int target_length=sc.nextInt();
            for(int i=0;i<8;i++) {
                String line = sc.next();
                for(int j=0;j<8;j++){
                    arr[i][j]=line.charAt(j);
                }
            }
            int count=0;
            //가로 검사
            for(int i=0;i<8;i++){
                for(int j=0;j<=8-target_length;j++){
                    char[]word=new char[target_length];
                    int x=0;
                    for(int k=0;k<target_length;k++){
                        word[x]=arr[i][j+k];
                        x++;

                    }
                    if(check(word)){
                        count++;
                    }
                }
            }
            //세로검사
            for(int i=0;i<8;i++){
                for(int j=0;j<=8-target_length;j++){
                    char[]word=new char[target_length];
                    int x=0;
                    for(int k=0;k<target_length;k++){
                        word[x]=arr[j+k][i];
                        x++;

                    }
                    if(check(word)){
                        count++;
                    }
                }
            }


            System.out.println("#"+tc+" "+count);



        }
    }
    static boolean check(char[]word){
        for(int i=0;i<word.length/2;i++){
            if(word[i]!=word[word.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
