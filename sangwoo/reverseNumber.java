import java.util.Arrays;
 
class Solution {
    public long solution(long n) {
        long answer = 0;
 
        String str = String.valueOf(n);
        long[] array = new long[str.length()];
 
        for (int i = 0; i < array.length; i++) {
            array[i] = Long.parseLong(str.substring(i, i + 1));
        }
 
        Arrays.sort(array); // 오름차순 정렬
 
        /* 역순 정렬 */
        for (int i = array.length - 1; i >= 0; i--) {
            answer = answer * 10 + array[i];
        }
 
        return answer;
    }
}
