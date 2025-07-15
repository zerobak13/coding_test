package string;

import java.util.*;

public class p1764 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        sc.nextLine();

        Set<String> nothear =new HashSet<>();
        for(int i=0;i<N;i++){
            nothear.add(sc.nextLine());
        }

        List<String>nothearsee=new ArrayList<>();
        for(int i=0;i<M;i++){
            String name=sc.nextLine();
            if(nothear.contains(name)){
                nothearsee.add(name);
            }
        }
        Collections.sort(nothearsee);

        System.out.println(nothearsee.size());
        for(String result:nothearsee){
            System.out.println(result);
        }
    }

}
