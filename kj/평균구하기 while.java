// https://programmers.co.kr/learn/courses/30/lessons/12944

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        
        int i = 0;
        
        while(i < arr.length){
            sum = sum + arr[i];
            i++;
            
        }
        
        answer = sum / arr.length;
        
        return answer;
    }
}