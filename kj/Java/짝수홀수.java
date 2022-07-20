// https://programmers.co.kr/learn/courses/30/lessons/12937


public class 짝수홀수 {
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }

        return answer;
    }
}