// https://school.programmers.co.kr/learn/courses/30/lessons/42576

import java.util.Arrays;

public class 완주못한_선수 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i=0;
        for (i = 0; i <completion.length ; i++) { // 완주자 수 만큼 반복
            if(!participant[i].equals(completion[i])){ // 참가자와 완주자가 같지 않으면
                return participant[i]; // 해당 참가자를 리턴
            }
        }
        return participant[i]; // 참가자 배열의 관점에서 마지막까지 참가자가 완주자와 일치했을 경우에는, 마지막에 남아있는 참가자가 탈락이므로(참가자가 탈락자보다 항상 한 명 많음), for문이 끝난 후 남아있는 참가자를 탈락자로 반환
    }
}
