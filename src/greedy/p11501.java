package greedy;

import java.util.Scanner;

public class p11501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n;i++){
            int day= sc.nextInt();
            long[]price=new long[day];
            for(int j=0;j<day;j++){
                price[j]=sc.nextLong();
            }

            long maxPrice=0;
            long profit=0;

            for(int k=day-1;k>=0;k--){
                if(price[k]>maxPrice){
                    maxPrice=price[k];
                }
                else{
                    profit+=(maxPrice-price[k]);
                }

            }
            System.out.println(profit);


        }
        sc.close();
    }
}
