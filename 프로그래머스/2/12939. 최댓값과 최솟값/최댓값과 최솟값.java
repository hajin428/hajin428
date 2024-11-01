class Solution {
    public String solution(String s) {
        
        // 공백으로 문자열 분리
        String[] numbers = s.split(" ");

        // 첫 번째 숫자로 초기 최소값과 최대값 설정
        int min = Integer.parseInt(numbers[0]);
        int max = Integer.parseInt(numbers[0]);

        // 나머지 숫자들로 최소값과 최대값 갱신
        for (String num : numbers) {
            int number = Integer.parseInt(num);
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        // 최소값과 최대값을 문자열로 반환
        return min + " " + max;
    }
}

// 문자열 잘라서 배열로 저장
// 문자 배열 숫자로 변환
// 최댓값, 최소값소값