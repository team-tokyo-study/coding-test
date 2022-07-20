// https://school.programmers.co.kr/learn/courses/30/lessons/92334

import java.util.*;

public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) { // id_list = [muzi, frodo, apeach, neo] report = [신고한id 신고당한id]의 배열
        int[] answer = new int[id_list.length]; // id_list에 담긴 순서대로 각 유저가 받은 결과 메일 수
        HashMap<String,Integer> idMap = new HashMap<>(); // idMap : id별 순서 저장 
        HashMap<String,HashSet<String>> map = new HashMap<>(); // map key : 신고당한 id, value : 신고한 id. 
        // Hashset : 데이터의 중복을 검사하여 중복된 데이터가 있다면 제거해줌. 문제에서 동일한 유저에 대한 신고 횟수는 1회로 처리된다고 나와있기 때문에 중복을 없애주는 Hashset사용

        for(int i=0;i<id_list.length;i++){
            idMap.put(id_list[i],i); // 이용자 id를 순서대로 idMap 배열에 저장 → idMap = {muzi=0, frodo=1, apeach=2, neo=3}
            map.put(id_list[i],new HashSet<>()); // 신고당한 id, 신고한 id를 map 배열에 저장 → map = {muzi=[], neo=[], frodo=[], apeach=[]}       
        } // map에서 put은 key와 value를 map에 저장하는 메소드, get은 입력받은 key에 대응하는 value를 돌려주는 메소드 

        for(String s : report){ // report 배열을 하나하나 s에 대입하고 반복. report배열값이 그대로 출력.  
            String[] str = s.split(" "); // [신고한id 신고당한id]를 공백을 기준으로 자름
            map.get(str[1]).add(str[0]); // 신고당한 id str[1]을 값을 보고 누가 신고했는지 id str[0]에 저장 
            // → map = {muzi=[apeach], neo=[muzi, frodo], frodo=[muzi, apeach], apeach=[]}
        }

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = map.get(id_list[i]); // send : map의 신고당한 id에서 그 id를 신고한 id가 누구인지 가져옴
            if (send.size() >= k) { // 신고당한 id별 신고자 수가 k명 이상일 때(아마 두 명 이상임을 뜻하는듯)
                for (String name : send) { // send값을 name에 대입하고 반복. send에 해당하는 id는 muzi, frodo, apeach
                    answer[idMap.get(name)]++; // 두 명 이상에게 신고당한 첫 번째 id neo의 send값(muzi, frodo)을 도출 후 1을 더해줌(+1은 처리결과 메일을 한 번 받았다는 의미) → [1,1,0,0]
                                              // 반복하여, 두 명 이상에게 신고당한 두 번째 id frodo의 send값(muzi, apeach)을 도출 후 1을 더해줌 → [2,1,1,0]
                }
            }
        }

        return answer;
    }
}