package programmers.dfs_bfs;

public class p1 {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int[]numbers1={1, 1, 1, 1, 1};
        int target1=3;
        System.out.println(sol.solution(numbers1,target1));
    }


}
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer=dfs(numbers,0,0,target);
        return answer;
    }
    public int dfs(int[]numbers,int sum,int index,int target){
        if(index==numbers.length){
            if(sum==target){
                return 1;
            }
            else{
                return 0;
            }
        }

       return dfs(numbers,sum+numbers[index],index+1, target)+ dfs(numbers,sum-numbers[index],index+1,target);


    }
}
