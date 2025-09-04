package SWEA.D3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p1244 {
    static int change_num;
    static int max_value;
    static Set<String>s;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            max_value=0;
            s=new HashSet<>();
            String num=sc.next();
            change_num=sc.nextInt();
            dfs(num.toCharArray(),0);
            System.out.print("#"+(i+1)+" "+max_value);
            System.out.println();

        }


    }
    static void dfs(char[] array,int depth) {
        if (depth == change_num) {
            max_value= Math.max(max_value, Integer.parseInt(new String(array)));
            return;
        }
        String check=new String(array)+depth;
        if(s.contains(check)){
            return;
        }

        s.add(check);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                swap(array, i, j);
                dfs(array,depth+1);
                swap(array,i,j);
            }
        }
    }
    static void swap(char[]array,int i,int j){
        char temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }


}



