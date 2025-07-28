package implementation;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

//50363
public class p5800 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int K=sc.nextInt();
        for(int i=0;i<K;i++){
            int gap=0;
            int N=sc.nextInt();
            Integer[]arr=new Integer[N];//int 는 왜 안됨?
            for(int j=0;j<N;j++){
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr, Collections.reverseOrder());//Collections.reverseOrder()는 참조 타입(Reference Type) 에만 동작하기 때문에, int[] 같은 원시 타입(Primitive Type) 배열에는 사용할 수 없습니다.
            for(int k=0;k<N;k++){
                if(k<N-1) {
                    if ((arr[k] - arr[k+1]) > gap) {
                        gap=(arr[k] - arr[k+1]);
                    }
                }
            }
            System.out.println("Class"+" "+ (i+1));
            System.out.println("Max"+" "+arr[0]+","+" "+"Min"+" "+arr[N-1]+","+" "+"Largest gap"+" "+gap );

        }

    }
}
