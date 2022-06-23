class Solution {
public int[] solution(long park) {

    String a = "" + park;
    
    int[] answer = new int[a.length()];
    
    int b = 0;
    
    while (park > 0) {
         
        answer[b] = (int) (park % 10);

        park /= 10;

        b++;
    }      
    return answer;