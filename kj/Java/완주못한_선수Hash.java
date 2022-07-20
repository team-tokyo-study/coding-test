// https://coding-grandpa.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%99%84%EC%A3%BC%ED%95%98%EC%A7%80-%EB%AA%BB%ED%95%9C-%EC%84%A0%EC%88%98-%ED%95%B4%EC%8B%9C-Lv-1

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution_Hash {
    public String solution(String[] participant, String[] completion) { 
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>(); //해시맵<Key값(participant), Value(Count)> → participant를 String, Value를 Integer로 정의 
        for (String player : participant) // (위에 이어서) participant 배열을 만들고 
            map.put(player, map.getOrDefault(player, 0) + 1); // player의 키 값이 존재하면 키 값을 넣어주고 없으면 기본값으로 설정된 0을 넣어줌. 그 후 키 값에 1씩 더해줌
            // 플레이어에 중복된 값이 없으면 0을 반환, 같은 값이 있으면 그 중복개수만큼을 반환. ex) 마이크, 안나, 마이크(동명이인), 해리가 키일 경우 → 마이크 1(마이크는 하나가 중복되므로), 안나 0, 해리 0 → 후에 +1 
            for (String player : completion) 
            map.put(player, map.get(player) - 1); // 완주자의 키 값을 -1 해줌. 결과, 완주자의 키 값은 0이 되고, 완주하지 못한 참가자는 키 값이 그대로 1 이상으로 남게 됨

            Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator(); // Iterator는 배열이나 그와 유사한 자료구조의 내부요소를 순회한다. 위에서 작성한 맵 배열을 쭉 반복하며 돈다

        while(iter.hasNext()){  // iter.hasNext() = 다음 요소에 읽어 올 요소가 있는지 확인 하는 메소드로, 있으면 true, 없으면 false 를 반환
            Map.Entry<String, Integer> entry = iter.next(); // iter.next = 다음 요소를 가져온다
            if (entry.getValue() != 0){ // 맵 배열의 키 값이 0이 아니면, 즉 완주하지 못해서 키 값이 1 이상일 경우
                answer = entry.getKey(); // 0이 아닌 키 값에 해당하는 키를 가져오고
                break; // 브레이크
            }
        }
        return answer; // 키를 반환
    }
    
    public static void main(String[] args){
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        Solution_Hash sol = new Solution_Hash();
        System.out.println(sol.solution(part, comp));
    }
}