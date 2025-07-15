package implementation;

public class p4673 {


    public static void main(String[] args) {

        boolean[]GenNum=new boolean[10001];


        for(int i=1;i<=10000;i++){
            int num=d(i);
            if(num<=10000) {
                GenNum[num] = true;
            }
        }

        for(int i=1;i<=10000;i++){
            if(!GenNum[i]){
                System.out.println(i);
            }
        }
    }




    static int d(int n){
        int sum=n;
        while(n!=0){
            sum+=n%10;
            n/=10;

        }
        return sum;
    }
}
