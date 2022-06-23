// https://programmers.co.kr/learn/courses/30/lessons/12933

class Solution {
    public long solution(long n) {
        long answer = 0;
        String nstr = String.valueOf(n); // valueOf(n) = 정수 n을 string으로 바꿔줌
        char [] narr = nstr.toCharArray(); // toCharArray() = 문자열을 배열로 바꿔줌
        char temp; // char 변수 선언
    
        /*배열의 첫번째 인덱스는 1이 아닌 0이므로 배열의 마지막 인덱스는 배열.length - 1이다
        배열 [7,8,9]에서 0번째 인덱스값은 7, 1번째 인덱스값은 8, 마지막(두번쨰) 인덱스값은 9
        */  
        for (int i=0; i<narr.length-1; i++){ //첫번째 인덱스 ~ 마지막 인덱스 반복
            for(int j=i+1; j<narr.length; j++){
                if(narr[i] < narr[j]){
                    temp = narr[i];
                    narr[i] = narr[j];
                    narr[j] = temp;
                }
            }
        }
        nstr = "";
        for(int i=0; i<narr.length; i++){
            nstr +=narr[i];
        }
        answer = Long.parseLong(nstr);
        
        return answer;
    }
} 


/*
    import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] arr = Long.toString(n).toCharArray();
        Arrays.sort(arr);
        return Long.parseLong(new StringBuilder(new String(arr)).reverse().toString());
    }
}
 */




