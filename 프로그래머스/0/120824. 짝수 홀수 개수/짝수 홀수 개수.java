class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int c=0;
        int h=0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                c++;
            }else{
                h++;
            }
        }
        answer[0]=c;
        answer[1]=h;
        return answer;
    }
}