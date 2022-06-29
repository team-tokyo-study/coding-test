class Solution {
public boolean solution(String s) {
boolean answer = true;


  if(s.length() != 4 && s.length() != 6)    
          answer = false;   // 길이가 4나 6이 아닌 경우 => false
  for(int i=0; i<s.length(); i++)   // 문자열에 숫자가 아닐 경우 => false
             if(s.charAt(i) >= 'a')  // charAt은 특정 위치의 문자를 반환, 'a'와 같거나 큰 경우 false
          answer = false;
  return answer;
}
}