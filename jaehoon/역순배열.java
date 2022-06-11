package jaehoon;

class 역순배열 {
    public int[] solution(long n) {
        String s = String.valueOf(n); // 문자열으로 변환
        int[] answer = new int[s.length()]; // 문자열만큼 선언

        for (int i = 0; i < s.length(); i++) { // 문자열만큼 for문 실행
            int genso = Integer.parseInt(s.substring(s.length() - i - 1, s.length() - i)); // 서브스트링으로 잘라줌 n=12345 >
                                                                                           // 뒤부터들어가게
            answer[i] = genso; // 숫자를 원소러가지는 배열형태

        }
        return answer;
    }
}
