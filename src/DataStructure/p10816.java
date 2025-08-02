package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        Map<Integer,Integer>map=new HashMap<>();

        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int num1=Integer.parseInt(st.nextToken());
            map.put(num1, map.getOrDefault(num1,0)+1);
        }
        int M=Integer.parseInt(br.readLine());

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            int num2=Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(num2,0)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}

//Scanner sc=new Scanner(System.in);
//
//int N=sc.nextInt();
//Map<Integer,Integer>map=new HashMap<>();
//        for(int i=0;i<N;i++){
//int num1=sc.nextInt();
//            map.put(num1, map.getOrDefault(num1,0)+1);
//        }
//int M=sc.nextInt();
//List<Integer>result=new ArrayList<>();
//        for(int i=0;i<M;i++){
//int num2=sc.nextInt();
//            result.add(map.getOrDefault(num2,0));
//        }
//        for(int i=0;i<result.size();i++){
//        System.out.print(result.get(i));
//        if(i<result.size()-1){
//        System.out.print(" ");
//            }
//                    }
//                    sc.close();
//    }
