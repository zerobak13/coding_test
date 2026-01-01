package baekjoon30.backtracking;

import java.util.Arrays;
import java.util.Scanner;
//visited 없어도 됨
public class b1759 {
    static int L;
    static int C;
    static String[]word;
    static String[]result;
    //static boolean[]visited;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        L=sc.nextInt();
        C=sc.nextInt();
        word=new String[C];
        result=new String[L];
        //visited=new boolean[C];
        for(int i=0;i<C;i++){
            word[i]=sc.next();
        }
        Arrays.sort(word);
        dfs(0,0);
    }
    static void dfs(int index,int count){
        if(count==L){
            if(isValid()) {
                for (int i = 0; i < L; i++) {
                    System.out.print(result[i]);
                }
                System.out.println();
            }
            return;
        }
        for(int i=index;i<C;i++){
            //if(!visited[i]) {
               // visited[i] = true;
                result[count]=word[i];
                dfs(i+1,count+1);
                //visited[i]=false;
           // }
        }
    }
    static boolean isValid(){
        int m=0;
        int j=0;
        for(int i=0;i<L;i++){
            if(result[i].equals("a")||result[i].equals("e")||result[i].equals("i")||result[i].equals("o")||result[i].equals("u")){
                m++;
            }
            else{
                j++;
            }
        }
        if(m>=1&&j>=2){
            return true;
        }
        return false;
    }
}
