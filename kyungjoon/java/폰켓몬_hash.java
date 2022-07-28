// https://school.programmers.co.kr/learn/courses/30/lessons/1845

import java.util.HashSet;

public class 폰켓몬_hash {
    public int solution(int[] nums) { // int[] nums: 폰켓몬 종류번호가 담긴 배열
    
        HashSet<Integer> set = new HashSet<>(); 
        // set이란 이름의 정수 해쉬셋 선언. 해쉬셋은 순서정렬은 안되지만 중복값은 제거해주는 배열
        
        for (int num : nums) // for로 종류번호 num을 배열 nums에 담아준다
        {
            set.add(num);
        } 
        
        return Math.min(set.size(), nums.length / 2); 
        /* 
        set.size() : 해쉬셋으로 출력된 중복이 제거된 배열의 사이즈로, 폰켓몬 종류의 수
        예를들어 [3,3,3,2,2,2]를 입력 받았을 때 HashSet을 거쳐 [3,2]만 츨력되므로 폰켓몬 종류의 수(배열의 사이즈)는 2개 

        ex) (1) [3,3,3,2,5,2,4,1] 에서 N/2는 4이고, set.size()는 [3,2,5,4,1]의 5. 
                가장 많은 종류를 택하는 방법은 5종류중 4개를 고르는 것이기 때문에 4가 리턴.
                즉, 값이 4인 N/2와 값이 5인 set.size()중 더 작은 값 4가 리턴됨

            (2) [2,4,4,4,2,4]의 경우 N/2는 3, set.size()는 [2,4]의 2.
                가장 많은 종류를 택하는 방법은 2종류중 3개를 고르는 것이기 때문에 2가 리턴.

        즉, 폰켓몬 종류의 수(set.size())와 항상 짝수인 폰켓몬의 총 마리수(N) / 2 (nums.length / 2) 중 작은 값을 반환하면 정답        
        */      
    }
}
