class Solution {
    public String solution(String my_string) {
        String answer = "";
        String [] sp=my_string.split("");
        for(int i=sp.length-1;i>=0;i--){
            answer+=sp[i];
        }
        return answer;
    }
}