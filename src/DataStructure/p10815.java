package DataStructure;

import java.util.*;

public class p10815 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Set<Integer>sk=new HashSet<>();
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            int num1=sc.nextInt();
            sk.add(num1);

        }
        List<Integer>result=new ArrayList<>();
        int M=sc.nextInt();
        for(int i =0;i<M;i++){
            int num2=sc.nextInt();
            if(sk.contains(num2)){
                result.add(1);
            }
            else{
                result.add(0);
            }
        }
        for(int val:result){
            System.out.print(val+" ");
        }




    }




}
