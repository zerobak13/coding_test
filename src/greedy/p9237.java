package greedy;
import java.util.*;

public class p9237 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        Integer[]trees=new Integer[n];

        for(int i =0; i<n; i++){
            trees[i]=sc.nextInt();
        }

        Arrays.sort(trees,Collections.reverseOrder());

        int max=0;
        for(int i=0;i<n;i++){
            int growday=i+1+trees[i];
            if(growday>max){
                max=growday;
            }
        }
        System.out.println(max+1);
    }
}
