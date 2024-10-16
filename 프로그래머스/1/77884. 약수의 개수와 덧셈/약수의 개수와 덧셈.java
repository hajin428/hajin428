class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        // left부터 right까지 모든 수에 대해 처리
        for (int i = left; i <= right; i++) {
            // 약수의 개수를 구하는 메서드 호출
            int divisorCount = getDivisorCount(i);

            // 약수의 개수가 짝수이면 더하고, 홀수이면 뺀다
            if (divisorCount % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    // 약수의 개수를 구하는 메서드
    private int getDivisorCount(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}