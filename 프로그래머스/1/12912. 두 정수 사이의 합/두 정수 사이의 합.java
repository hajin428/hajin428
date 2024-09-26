class Solution {
    public long solution(int a, int b) {

        long answer = 0;

        for(int i = Math.min(a,b); i <= Math.max(a,b); i++) {
            if(a == b) { //같으면 a 출력
                answer = a;
            } else { //아니면 최소~최대값 더하기
                answer += i;
            }
        }
        return answer;
    }
}