// https://programmers.co.kr/learn/courses/30/lessons/12940


/* 최대공약수 최소공배수 구하는 방법
    1. 최대공약수 : 유클리드 호제법
        두 양의 정수 a, b에 대해 (a>b)에 대해 a = bq +r (0≤r<b)이면 a,b의 최대공약수는 b,r의 최대공약수와 같다. 
        즉, gcd(a,b) = gcd(b,r). 여기서 r은 a를 b로 나눈 나머지(a%b)이다.
    2. 최소공배수 : a, b를 곱한 값을 최대공약수로 나눈 값    
*/


public class 최대공약_최소공배 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2]; // answer값은 배열 두 개를 출력
        int big = Math.max(n, m); // big은 n,m 중 큰 수를 출력
        int small = Math.min(n, m); //small은 n,m 중 작은 수를 출력
        
        answer[0] = gcd(big, small); // answer의 첫 번째 배열엔 최대공약수 출력
        answer[1] = big*small/answer[0]; // answer의 두 번째 배열엔 최소공배수 출력
        
        return answer;
    }

/*    
아래는 최대공약수를 구하는 식. gcd값을 static으로 선언함으로써 메모리에 고정시켜 프로그램 종료시까지 값을 유지시키고 공유해주는 역할을 한다
*/
    static int gcd(int a, int b) { // a와 b의 최대공약수 구하는 식  
         if(a % b == 0) { // a를 b로 나눴을 때 나머지가 0이면 
            return b;  // a와 b의 최대공약수는 b이므로 b 출력
        }
        return gcd(b, a%b); // 그렇지않으면 b와, a를 b로 나눈 나머지(r)의 최대공약수를 리턴하고 
                            // 다시 b와 a%b를 가지고 if문으로 돌아가서 나머지가 0이 될 때 까지 반복
            
    }
}