class Solution {
    public int[] solution(int[] arr) {
        int[] reversed = new int[arr.length];
        
        // 배열 뒤집기
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        
        return reversed;
    }
}