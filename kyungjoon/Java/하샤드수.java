// https://school.programmers.co.kr/learn/courses/30/lessons/12947

public class 하샤드수 {
    public boolean solution(int x) { 
      String str = String.valueOf(x); // 숫자를 문자로 변환 . Integer.toString(x); 과 같음
      String arr[] = str.split(""); // 문자로 변환된 x를 자리수로 잘라 배열에 담기
            
      int i = 0; // int값 i의 선언 및 초기화
      for(String s : arr) // 배열의 길이만큼 s를 반복하기 때문에 배열의 모든 요소가 출력 
          i += Integer.parseInt(s); // s를 정수형으로 변경하여 전부 더함
      if(x%i==0) // 정수 x가 자릿수의 합 i로 나누어 떨어지면 
          return true; // 하샤드수
            
      return false; // 나누어 떨어지지 않으면 하샤드수 아님
    }
}