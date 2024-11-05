class Solution {
    public int solution(int[] numbers) {
        int totalSum = 45; // 0부터 9까지의 숫자를 모두 더한 값
        int sumOfNumbers = 0;

        // 배열 내 숫자들의 합을 구합니다.
        for (int number : numbers) {
            sumOfNumbers += number;
        }

        // 전체 합에서 배열 내 숫자들의 합을 빼면 없는 숫자들의 합이 나옵니다.
        return totalSum - sumOfNumbers;
    }
}