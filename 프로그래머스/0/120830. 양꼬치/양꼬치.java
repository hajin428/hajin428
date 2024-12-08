class Solution {
    public int solution(int n, int k) {
        
        //양꼬치 10인분에 음료수 1개 서비스 K-(n/10)
        int a = k-(n/10);
        
        //양꼬치 1인분 12000원
        int nPrice = n*12000;
        
        //음료수 1개 2000원
        int aPrice = a*2000;
        
        int answer = nPrice+aPrice;
        return answer;
    }
}