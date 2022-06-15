package jaehoon;

class Solution {
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 1) {
            answer = "Odd";
        } else {
            answer = "Even";
        }

        return answer;

    }

    public static void main(String[] args) {
        Solution odd = new Solution();
        System.out.println(odd.solution(4));
        System.out.println(odd.solution(3));
    }
}