class Solution {
    public int solution(int n) {
        

        int sum = 0;
        for (int i = 2; i <= n; i += 2) { // 짝수만 반복
            sum += i;
        }
        return sum;
    }
}

// n 이하로 반복 
// 2로 나눴을 때 나누어 떯어지면 더하기 