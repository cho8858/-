class Solution {
    public int[] solution(int n) {
        int size=(n+1)/2;
        int[] answer = new int[size];
        int idx=0;
        for(int i=0;i<=n;i++){
            if(i%2==1){
                answer[idx]=i;
                idx++;
            }
        }
        return answer;
    }
}

// 1. 배열 크기가 달라요
// 2. 짝수 인덱스에 0이 들어가는데 ...?