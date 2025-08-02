package string;

import java.util.Scanner;

public class p1213 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        int[]alphabet=new int[26];

        for(char c:str.toCharArray()){
            alphabet[c-'A']++;
        }
        int odd_index=-1;
        int odd_count=0;
        for(int i=0;i<26;i++){
            if(alphabet[i]%2==1){
                odd_index=i;
                odd_count++;
            }
        }

        if((str.length()%2==0&&odd_count>0)||
                (str.length()%2==1&&odd_count>1)){
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder token1= new StringBuilder();
        for(int i=0;i<26;i++){
            for(int j=0;j<alphabet[i]/2;j++){
                token1.append((char)(i+'A'));
            }
        }

        StringBuilder result=new StringBuilder();
        result.append(token1);
        if(odd_index!=-1){
            result.append((char)(odd_index+'A'));
        }
        result.append(token1.reverse());

        System.out.println(result.toString());

    }
}
