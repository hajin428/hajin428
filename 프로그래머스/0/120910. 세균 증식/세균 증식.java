class Solution {
    public int solution(int n, int t) {
        
        // n * (2의 거듭제곱)
        int answer = n * (int)Math.pow(2, t);
        return answer;
    }
}