// https://programmers.co.kr/learn/courses/30/lessons/12932?language=java
// https://sas-study.tistory.com/145

class Solution {
    public int[] solution(long n) {
        String a = "" + n;
            int[] answer = new int[a.length()];
            int cnt=0;

            while(n>0) {
                answer[cnt]=(int)(n%10);
                n/=10;
                cnt++;
            }
        return answer;
    }
}