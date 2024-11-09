import java.util.Arrays;

class Solution{
    public int solution(int []A, int []B){
        Arrays.sort(A); // A를 오름차순 정렬
        Arrays.sort(B); // B를 오름차순 정렬
        int n = A.length;
        
        int minSum = 0;
        for (int i = 0; i < n; i++) {
            minSum += A[i] * B[n - i - 1]; // A의 최솟값 * B의 최댓값 순으로 곱
        }
        
        return minSum;
    }
}