class Solution {
    public long solution(long n) {
        long answer = 0;

        
        double d = Math.sqrt(n);//n의 제곱근을 구하는 함수 121.0 > 11.0

        if((d % 1) == 0) { //11.0을 1로 나머지 나눗셈했을 때 아무것도 남은 게 없으면 참
            return answer = (long)Math.pow((d+1), 2);
        } else { 
            return answer = -1; // 나머지가 0.xx로 나오면 제곱근이 아니기 때문에 여기로 반환
        }
    }
}