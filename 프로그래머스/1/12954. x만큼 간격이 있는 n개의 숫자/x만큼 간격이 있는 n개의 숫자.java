class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        
        for (int i=0; i<n; i++){
            answer[i] = x*(i+1);
        }
        return answer;
    }
}

// 인덱스 0부터 첫번째 값은 x
// x씩 증가하는 n개의 배열 