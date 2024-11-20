import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // 나누어 떨어지는 숫자를 담을 리스트 생성
        List<Integer> list = new ArrayList<>();
        
        // 반복문으로 나누어 떨어지는 숫자 필터링
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }
        
        // 리스트가 비어 있으면 -1 반환
        if (list.isEmpty()) {
            return new int[] {-1};
        }
        
        // 리스트를 배열로 변환 후 정렬
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        Arrays.sort(result); // 오름차순 정렬
        
        return result;
    }
}