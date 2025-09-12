class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        int max=0;
        int sum=0;
        for(int i=0;i<sides.length;i++){
            sum+=sides[i];
          if(sides[i]>max){
              max=sides[i];
          }
            if(sum-max>max)
            answer=1;
            
        }
        return answer;
    }
}