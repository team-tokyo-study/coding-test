package jaehoon;

class Average {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i]; // 모든 숫자의 합
        }
        answer = answer / arr.length;
        return answer;
    }
}