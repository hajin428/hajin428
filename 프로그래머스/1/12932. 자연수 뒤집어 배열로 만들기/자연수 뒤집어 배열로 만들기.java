class Solution {
    public int[] solution(long n) {
        
        //자연수를 문자열로 변환 
        String str = Long.toString(n);
        
        //문자열을 잘라서 배열에 저장
        String[] arr = str.split("");

        // 반복문 사용해서 배열의 맨뒤부터 가져와서 새로운 배열에 저장
        int[] answer = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            answer[arr.length - i - 1] = Integer.parseInt(arr[i]);
        }

        return answer;
    }
}

