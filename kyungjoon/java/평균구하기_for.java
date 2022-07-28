// https://programmers.co.kr/learn/courses/30/lessons/12944

public class 평균구하기_for {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        
        answer = sum / arr.length;
        
        return answer;
    }
}