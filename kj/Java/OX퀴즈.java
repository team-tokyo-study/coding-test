// https://acmicpc.net/problem/8958

import java.util.Scanner;

public class OX퀴즈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 입력할 행의 수(N)를 정수로 입력. 3행이라고 가정
        
        sc.close();
        String str; // OX 문자열을 담을 스트링 선언
        for(int i = 1; i <= N; i++)  // N이 3이므로 문자열을 3행 반복시켜주는 로직
        {
            str = sc.next(); // 실제로 문자열 입력 (1행씩 3번 입력 가능)
            int sum = 0, cnt = 0; // 총점수 sum, 연속된 문자 O를 셀 변수 cnt 선언
            for(int j = 0 ; j < str.length(); j++) // j는 자리수. 위에서 str = sc.next();로 입력한 문자열의 길이만큼 반복 검사해줌
            {
                if(str.charAt(j) == 'O')  //위에서 입력된 문자열에 O이 나오면
                {
                    cnt++; // 카운트를 올림
                    sum += cnt; // 연속으로 올라간 카운트만큼 합계를 구함
                }
                else
                    cnt = 0; // 문자열이 O이 아니면 카운트는 0으로 리셋
            }
            System.out.println(sum); // 합계 출력
        }
        
    }
}