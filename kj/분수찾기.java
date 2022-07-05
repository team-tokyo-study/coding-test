// https://www.acmicpc.net/problem/1193

import java.util.Scanner; // 스캐너 클래스 호출


public class 분수찾기 { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // scan이라는 객체를 가지는 Scanner클래스 선언, System.in은 사용자로부터 입력을 받기 위한 입력 스트림
        int a = scan.nextInt(); // 입력받은 값을 int 타입으로 변환
        int count = 0; // 각 행의 분수 개수의 합산
        int line = 0; // 행

        scan.close(); // 스캐너 닫아줌 (안닫으면 오류발생)

        while(true) {
            line++; 
            count =count+line; // 카운트는 전 행까지의 카운트 + 현재의 행  

            if(count>=a) { // a의 최대치는 그 행의 count값임. 다음행의 count까지 볼 필요 없음
                if(line%2==1) { // a가 있는 행이 홀수일때  
                    System.out.println((count-a+1) + "/" + (a-count+line));                    
                } else { // a가 있는 행이 짝수일때
                    System.out.println((a-count+line) + "/" + (count-a+1));
                }
            break;
            }
        }
    }
}




/*
1                                cnt 1      n 1
3   2                            cnt 3      n 2
4   5   6                        cnt 6      n 3
10  9   8   7                    cnt 10     n 4
11 12 13 14 15 (번)              cnt 15     n 5


1/1                              cnt 1      n 1
2/1 1/2                          cnt 3      n 2  
3/1 2/2 1/3                      cnt 6      n 3           
4/1 3/2 2/3 1/4                  cnt 10     n 4
5/1 4/2 3/3 2/4 1/5 (분수)       cnt 15     n 5



line이 3이고 count가 6인 4번째(a=4) 함수 구하기? 답은 3/1





a : 원하는 분수 번호
count : 각 행의 분수 개수의 합산
line : 몇 번째 행인지


count = count + line

홀수행(line이 홀수일때) 분모 = a - count + line
홀수행(line이 홀수일때) 분자 = count - a + 1

짝수행(n이 짝수일때) 분모 = count - a + 1
짝수행(n이 짝수일때) 분자 = a - count + line
 */