// https://programmers.co.kr/learn/courses/30/lessons/12932?language=java



class Solution {
    public int[] solution(long n) {
          String s = String.valueOf(n); //String.valueOf를 통하여 Long 자료형을 String으로 변환
        int[] answer = new int[s.length()]; //변환한 문자열 길이 만큼 int[] 배열을 선언하여 초기화
        
        for(int i=0; i<s.length(); i++) {
            int value = Integer.parseInt(s.substring(s.length()-i-1, s.length()-i));
            System.out.println(s.substring(4,5));
            System.out.println(s.length()-i-1);
            System.out.println(s.length()-i);
            answer[i] = value;
        }
        return answer;
    }
}