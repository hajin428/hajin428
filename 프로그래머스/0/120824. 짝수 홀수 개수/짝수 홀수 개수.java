class Solution {
    public int[] solution(int[] num_list) {
        
        int evenCount = 0; // 짝수 개수
        int oddCount = 0;  // 홀수 개수

        for (int number : num_list) {
            if (number % 2 == 0) {
                evenCount++; // 짝수면 증가
            } else {
                oddCount++;  // 홀수면 증가
            }
        }

        return new int[]{evenCount, oddCount}; // 결과 배열로 반환
    }
}