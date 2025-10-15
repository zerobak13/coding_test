package SWEA.D3;

import java.util.Scanner;

public class p13428 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            String num=sc.next();
            char[]origin=num.toCharArray();
            String max=num;
            String min=num;
            for(int i=0;i<origin.length-1;i++){
                for(int j=i+1;j<origin.length;j++){
                    char[]arr=origin.clone();
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    if(arr[0]=='0'){
                        continue;
                    }
                    String changed=new String(arr);
                    if(changed.compareTo(max)>0){
                        max=changed;
                    }
                    if(changed.compareTo(min)<0){
                        min=changed;
                    }

                }
            }
            System.out.println("#"+tc+" "+min+" "+max);





        }

    }

}
