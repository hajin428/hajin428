class Solution {
    boolean solution(String s) {

        String lowerCase = s.toLowerCase();

        int pCount = 0;
        int yCount = 0;

        for (char c : lowerCase.toCharArray()) {
            if (c == 'p') {
                pCount++;
            } else if (c == 'y') {
                yCount++;
            }
        }

        return pCount == yCount;
    }
}