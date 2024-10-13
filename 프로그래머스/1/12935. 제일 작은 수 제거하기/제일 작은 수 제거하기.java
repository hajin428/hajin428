class Solution {
    public int[] solution(int[] arr) {
        // 길이가 1이면 -1을 리턴
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 최소값을 찾기 위한 인덱스
        int minIndex = 0;
        
        // 배열을 순회하면서 최소값의 인덱스를 찾음
        for (int i = 1; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        
        // 새로운 배열에 최소값을 제외한 값을 복사
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != minIndex) {
                answer[index++] = arr[i];
            }
        }

        return answer;
    }
}
