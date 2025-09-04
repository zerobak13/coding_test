package greedy;

import java.util.Scanner;

public class p19941 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        String line=sc.next();
        char[]arr=new char[N];
        for(int i=0;i<N;i++){
            arr[i]=line.charAt(i);
        }
        int count=0;
        boolean caneat;
        for(int i=0;i<N;i++){
            caneat=false;
            if(arr[i]=='P'){
                //왼쪽 검사
                for(int j=K;j>=1;j--){
                    if(i-j>=0&&arr[i-j]=='H'){
                        caneat=true;
                        count++;
                        arr[i-j]='X';
                        break;
                    }
                }
                //오른쪽 검사
                if(!caneat) {
                    for (int j = 1; j <= K; j++) {
                        if (i + j < N && arr[i + j] == 'H') {
                            count++;
                            arr[i+j] = 'X';
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(count);

    }
}
