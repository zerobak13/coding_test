package SWEA.D2;


import java.util.Scanner;

public class p2007 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            String line=sc.next();
            String target="";
            boolean check=false;
            for(int i=1;i<=10;i++){
                if(check){
                    break;
                }
                String candidate=line.substring(0,i);
              for(int j=i;j<=i+candidate.length();j++){
                  if(candidate.equals(line.substring(i,j))){
                      target=candidate;
                      check=true;
                  }
              }
            }
            //System.out.println(target);
            System.out.println("#"+tc+" "+target.length());


        }


    }
}
