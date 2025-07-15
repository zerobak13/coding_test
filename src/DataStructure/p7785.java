package DataStructure;

import java.util.*;

public class p7785 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        HashSet<String>people =new HashSet<>();

        for(int i=0;i<n;i++){
            String name=sc.next();
            String cmd=sc.next();

            if(cmd.equals("enter")){
                people.add(name);
            }
            else if(cmd.equals("leave")){
                people.remove(name);
            }
        }

        List<String>result=new ArrayList<>(people);
        Collections.sort(result,Collections.reverseOrder());

        for(String name:result){
            System.out.println(name);
        }




    }
}
